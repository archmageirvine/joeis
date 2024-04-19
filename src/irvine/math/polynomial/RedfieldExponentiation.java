package irvine.math.polynomial;

import java.util.ArrayList;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Cycle index exponentiation operation. Computes <code>Z([A]^B)</code>
 * from <code>Z(A)</code> and <code>Z(B)</code> using the method
 * described by Palmer and Robinson in "Enumeration Under Two Representations
 * of the Wreath Product"
 * @author Sean A. Irvine
 */
public final class RedfieldExponentiation {

  private RedfieldExponentiation() { }

  private static CycleIndex d(final int r, final int k, final int i) {
    if (r % i == 0 && IntegerUtils.gcd(r / i, k) == 1) {
      return new CycleIndex("d_" + i, MultivariateMonomial.create(k * i, Z.ONE, new Q(1, k)));
    } else {
      return CycleIndex.ZERO;
    }
  }

  // Equation (15), J_r(x_k^j)
  private static CycleIndex j(final int r, final int k, final int j) {
    final ArrayList<CycleIndex> d = new ArrayList<>();
    d.add(null); // index 0
    for (int i = 1; i <= j; ++i) {
      d.add(d(r, k, i));
    }
    final CycleIndex jr = SymmetricGroup.create(j).cycleIndex().apply(StandardMultiply.OP, d);
    jr.multiply(new Q(Functions.FACTORIAL.z(j).multiply(Z.valueOf(k).pow(j))));
    return jr;
  }

  // Equation (16), J_r(x_1^{j_1} ... x_n^{j_n}) = prod_{k=1..n} J_r(s_k^{j_k})
  private static CycleIndex j(final MultivariateMonomial beta, final int r) {
    CycleIndex jr = CycleIndex.ONE;
    for (final Map.Entry<Pair<String, Integer>, Z> pk : beta.entrySet()) {
      final int k = pk.getKey().right(); // ignore the indeterminate name, assume all the same
      final int jk = pk.getValue().intValueExact();
      final CycleIndex jrb = j(r, k, jk);
      jr = jr.op(StandardMultiply.OP, jrb);
    }
    jr.multiply(beta.getCoefficient());
    jr.setName("J_" + r);
    return jr;
  }

  // J_r(Z(B))
  static CycleIndex j(final CycleIndex b, final int r) {
    final CycleIndex jr = new CycleIndex("J_" + r + "(" + b.getName() + ")");
    for (final MultivariateMonomial beta : b.values()) {
      jr.add(j(beta, r));
    }
    return jr;
  }

//  /**
//   * Compute cycle index exponentiation <code>Z([B]^A)</code>.
//   * @param op underlying multiply
//   * @param b base
//   * @param a exponent
//   * @return cycle index
//   */
//  public static CycleIndex exponentiation(final MultivariateMonomialOperation op, final CycleIndex b, final CycleIndex a) {
//    final int max = a.maxIndex();
//    final ArrayList<CycleIndex> j = new ArrayList<>();
//    j.add(null); // index 0
//    for (int r = 1; r <= max; ++r) {
//      j.add(j(b, r));
//    }
////    System.out.println("J: " + j);
////    System.out.println("A: " + a);
////    // Substitute J_r into a
////    final CycleIndex res = a.apply(op, j);
////    res.setName("[" + a.getName() + ";" + b.getName() + "]");
////    return res;
//    final CycleIndex res = new CycleIndex();
//    for (final CycleIndex jr : j) {
//      if (jr != null) {
//        res.add(a.op(RedfieldMultiply.OP, jr));
//      }
//    }
//    return res;
//  }
//
//  /**
//   * Compute cycle index exponentiation <code>Z([B]^A)</code>.
//   * @param b base
//   * @param a exponent
//   * @return cycle index
//   */
//  public static CycleIndex exponentiation(final CycleIndex b, final CycleIndex a) {
//    return exponentiation(RedfieldMultiply.OP, b, a);
//  }

  /**
   * Compute <code>N[A;B]</code>
   * @param b base
   * @param a exponent
   * @return count
   */
  public static Z count(final CycleIndex b, final CycleIndex a) {
    final int max = a.maxIndex();
    final ArrayList<CycleIndex> j = new ArrayList<>();
    j.add(null); // index 0
    for (int r = 1; r <= max; ++r) {
      j.add(j(b, r));
    }
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : a.values()) {
      CycleIndex u = null;
      for (final Map.Entry<Pair<String, Integer>, Z> ak : m.entrySet()) {
        final int k = ak.getKey().right();
        final int jk = ak.getValue().intValueExact();
        final CycleIndex jj = j.get(k).pow(RedfieldMultiply.OP, jk, Integer.MAX_VALUE);
        u = u == null ? jj : u.op(RedfieldMultiply.OP, jj);
      }
      sum = sum.add(u.eval(1).multiply(m.getCoefficient()));
    }
    return sum.toZ();
  }

  /**
   * Demonstration calculating number of multigraphs with n vertices and m edges.
   * @param args n and m
   */
  public static void main(final String[] args) {
    final int n = Integer.parseInt(args[0]);
    final int m = Integer.parseInt(args[1]);
    final CycleIndex sm = SymmetricGroup.create(m).cycleIndex();
    final CycleIndex ci = SymmetricGroup.create(2).cycleIndex().op(StandardMultiply.OP, SymmetricGroup.create(n - 2).cycleIndex());
    System.out.println(count(ci, sm));
    //System.out.println(exponentiation(ci, sm).eval(1));
  }

}
