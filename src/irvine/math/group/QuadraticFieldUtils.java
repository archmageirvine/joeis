package irvine.math.group;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.r.Stats;
import irvine.math.z.Z;

/**
 * Utility functions.
 * @author Sean A. Irvine
 */
public final class QuadraticFieldUtils {

  private QuadraticFieldUtils() { }

  /**
   * Compute the fundamental unit of <code>Q(sqrt(discriminant))</code> for a
   * positive discriminant.
   * @param discriminant the discriminant
   * @return the fundamental unit as a pair
   * @throws IllegalArgumentException if the discriminant is non-positive.
   */
  public static Z[] fundamentalUnitPair(final Z discriminant) {
    // Algorithm 5.7.2 from Cohen, "A Course in Computational Algebraic Number Theory"
    if (discriminant.signum() <= 0) {
      throw new IllegalArgumentException();
    }
    final CR sqrtD = CR.valueOf(discriminant).sqrt();
    final Z d = sqrtD.floor();
    final Z b = d.isEven() == discriminant.isEven() ? d : d.subtract(1);

    Z u1 = b.negate();
    Z u2 = Z.TWO;
    Z v1 = Z.ONE;
    Z v2 = Z.ZERO;
    Z p = b;
    Z q = Z.TWO;

    while (true) {
      final Z a = p.add(d).divide(q);
      Z t = p;
      p = a.multiply(q).subtract(p);
      // Test for even period
      if (t.equals(p) && !Z.ZERO.equals(v2)) {
        final Z u = u2.square().add(v2.square().multiply(discriminant)).divide(q).abs();
        final Z v = u2.multiply(v2).multiply2().divide(q).abs();
        return new Z[] {u, v};
      } else {
        final Z t0 = a.multiply(u2).add(u1);
        u1 = u2;
        u2 = t0;
        final Z t1 = a.multiply(v2).add(v1);
        v1 = v2;
        v2 = t1;
        t = q;
        q = discriminant.subtract(p.square()).divide(q);
      }
      // Test for odd period
      if (q.equals(t) && !Z.ZERO.equals(v2)) {
        final Z u = u1.multiply(u2).add(discriminant.multiply(v1).multiply(v2)).divide(q).abs();
        final Z v = u1.multiply(v2).add(u2.multiply(v1)).divide(q).abs();
        return new Z[] {u, v};
      }
    }
  }

  /**
   * Compute the fundamental unit of <code>Q(sqrt(discriminant))</code> for a
   * positive discriminant.
   * @param discriminant the discriminant
   * @return the fundamental unit
   * @throws IllegalArgumentException if the discriminant is non-positive.
   */
  public static CR fundamentalUnit(final Z discriminant) {
    final Z[] uv = fundamentalUnitPair(discriminant);
    return CR.valueOf(discriminant).sqrt().multiply(uv[1]).add(CR.valueOf(uv[0])).divide(CR.TWO);
  }

  /**
   * Compute the norm of the fundamental unit of <code>Q(sqrt(discriminant))</code> for a
   * positive discriminant.
   * @param discriminant the discriminant
   * @return the fundamental unit
   * @throws IllegalArgumentException if the discriminant is non-positive.
   */
  public static Z fundamentalUnitNorm(final Z discriminant) {
    final Z[] uv = fundamentalUnitPair(discriminant);
    return uv[0].square().subtract(uv[1].square().multiply(discriminant)).divide(4);
  }

  /**
   * Compute the regulator of <code>Q(sqrt(discriminant))</code> for a
   * positive discriminant.
   * @param discriminant the discriminant
   * @return the regulator
   * @throws IllegalArgumentException if the discriminant is non-positive.
   */
  public static CR regulator(final Z discriminant) {
    return fundamentalUnit(discriminant).log();
  }

  private static final int CLASSNO_TERMS = 20;

  private static CR e1(final CR x) {
    return ComputableReals.SINGLETON.ei(x.negate()).negate();
  }

  /**
   * Compute the class number of <code>Q(sqrt(discriminant))</code> for a
   * positive discriminant.  Note the result is not provably correct.
   * @param discriminant the discriminant
   * @return the class number
   * @throws IllegalArgumentException if the discriminant is non-positive.
   * @throws UnsupportedOperationException if this discriminant cannot be
   * solved using the current algorithm.
   */
  public static long classNumber(final Z discriminant) {
    // Proposition 5.6.11 from Cohen, "A Course in Computational Algebraic Number Theory"
    CR sum = CR.ZERO;
    for (int k = 1; k < CLASSNO_TERMS; ++k) {
      final double erfc = Stats.erfc(k * Math.sqrt(Math.PI / discriminant.doubleValue())); // todo CR
      final CR crd = CR.valueOf(discriminant);
      final CR a = crd.sqrt().multiply(CR.valueOf(erfc)).divide(CR.valueOf(k));
      final CR b = e1(CR.PI.multiply(CR.valueOf(k * (long) k)).divide(crd));
      final CR c = a.add(b);
      sum = sum.add(c.multiply(CR.valueOf(discriminant.jacobi(Z.valueOf(k)))));
      //System.out.println("sum is now " + sum + " a=" + a + " b=" + b);
    }
    return sum.divide(regulator(discriminant)).divide(CR.TWO).round().longValueExact();
  }
}
