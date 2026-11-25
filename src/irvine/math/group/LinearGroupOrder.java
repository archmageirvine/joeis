package irvine.math.group;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Orders, exponents, and maximal element orders of finite linear groups.
 * @author Gregory Morse
 */
public final class LinearGroupOrder {

  private LinearGroupOrder() { }

  /**
   * Order of GL(n,q).
   * @param n dimension
   * @param q field size
   * @return group order
   */
  public static Z general(final int n, final Z q) {
    final Z qn = q.pow(n);
    Z order = Z.ONE;
    Z qi = Z.ONE;
    for (int k = 0; k < n; ++k) {
      order = order.multiply(qn.subtract(qi));
      qi = qi.multiply(q);
    }
    return order;
  }

  /**
   * Order over a residue ring, using reduction modulo each prime.
   * @param n dimension
   * @param modulus modulus
   * @param special require determinant one
   * @return group order
   */
  public static Z residue(final int n, final long modulus, final boolean special) {
    if (n == 0 || modulus == 1) {
      return Z.ONE;
    }
    final long dimension = (long) n * n - (special ? 1 : 0);
    final FactorSequence fs = Jaguar.factor(modulus);
    Z product = Z.ONE;
    for (final Z p : fs.toZArray()) {
      Z factor = general(n, p);
      if (special) {
        factor = factor.divide(p.subtract(1));
      }
      product = product.multiply(factor).multiply(p.pow(dimension * (fs.getExponent(p) - 1)));
    }
    return product;
  }

  /**
   * Order of PSL(n,q).
   * @param n dimension, at least two
   * @param q field size
   * @return group order
   */
  public static Z projectiveSpecial(final int n, final Z q) {
    final Z center = q.subtract(1);
    return general(n, q).divide(center.multiply(center.gcd(Z.valueOf(n))));
  }

  // Every order over a prime power divides one of these attained orders.
  // The split and nonsplit tori give the semisimple factors; a Jordan
  // block gives the full characteristic-power factor.
  private static Z[] maximalOrders(final Z p, final int e, final boolean special) {
    final Z lift = p.pow(e - 1);
    if (!special) {
      return new Z[] {lift.multiply(p).multiply(p.subtract(1)), lift.multiply(p.square().subtract(1))};
    }
    if (Z.TWO.equals(p)) {
      // For a norm-one unit 1+2x, x has even trace. Its square is 1 mod 8,
      // unlike unrestricted units in the nonsplit torus of GL(2).
      final int power = e == 1 ? 0 : Math.max(1, e - 2);
      return new Z[] {p.pow(e), Z.THREE.shiftLeft(power)};
    }
    return new Z[] {lift.multiply(p.subtract(1)), lift.multiply(p.add(1)), lift.multiply(p).multiply2()};
  }

  /**
   * Exponent of a degree-two group over a residue ring.
   * @param modulus modulus
   * @param special require determinant one
   * @return group exponent
   */
  public static Z exponent2(final long modulus, final boolean special) {
    final FactorSequence fs = Jaguar.factor(modulus);
    Z lcm = Z.ONE;
    for (final Z p : fs.toZArray()) {
      for (final Z d : maximalOrders(p, fs.getExponent(p), special)) {
        lcm = lcm.lcm(d);
      }
    }
    return lcm;
  }

  /**
   * Maximum element order of a degree-two group over a residue ring.
   * @param modulus modulus
   * @param special require determinant one
   * @return maximum order
   */
  public static Z maxOrder2(final long modulus, final boolean special) {
    final FactorSequence fs = Jaguar.factor(modulus);
    Set<Z> orders = Set.of(Z.ONE);
    for (final Z p : fs.toZArray()) {
      final Set<Z> next = new HashSet<>();
      for (final Z d : maximalOrders(p, fs.getExponent(p), special)) {
        for (final Z previous : orders) {
          next.add(previous.lcm(d));
        }
      }
      orders = next;
    }
    Z max = Z.ONE;
    for (final Z v : orders) {
      max = max.max(v);
    }
    return max;
  }
}
