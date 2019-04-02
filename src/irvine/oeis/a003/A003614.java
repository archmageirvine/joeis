package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003614 Symmetries in unrooted (1,4) trees on 3n-1 vertices.
 * @author Sean A. Irvine
 */
public class A003614 extends A003613 {

  // todo this just seems too much work for one sequence

//  // Eqn. (1.2.16) in McKeon thesis
//  // 24t(x,2) = 24T(x,2) + (36/x)T(x^2,2^2) - (12/x)T(x,2)^2 + (1/x^2)T(x,2)^4 + (18/x^2)T(x^2,2^2)T(x,2)^2
//  //            +(27/x^2)T(x^2,2^2)^2 + (426/x^2)T(x^4,2^4) + (104/x^2)T(x^3,8)T(x,2)
//
//  // Coefficient of x^n in ab.
//  private static List<Triple<Z>> coeff(final List<Triple<Z>> a, final List<Triple<Z>> b, final int n) {
//    final List<Triple<Z>> res = new ArrayList<>();
//    for (int i = 1; i <= n; ++i) {
//      final int j = n + 1 - i;
//      assert j > 0;
//      res.add(multiply(a.get(i), b.get(j)));
//    }
//    return collect(res);
//  }
//
//
//  // (18/x^2)T(x^2,2^2)T(x,2)^2
//  // (1/x)*(6y-3)T(x^2,y^2)T(x,y)
//  private List<Triple<Z>> subs2(final int n) {
//    final ArrayList<Triple<Z>> res = new ArrayList<>();
//    for (int i = 2; i <= n + 1; i += 2) {
//      final int j = n + 2 - i;
//      final List<Triple<Z>> lst = substitutePower(mT.get(i / 2), 2);
//      final List<Triple<Z>> m = multiply(lst, mT.get(j));
//      res.addAll(multiply(m, Y6));
//      res.addAll(multiply(m, -3));
//    }
//    return res;
//  }
//
//  // (1/x)T(x,y)^2
//  private List<Triple<Z>> square(final int n) {
//    final List<Triple<Z>> res = new ArrayList<>();
//    for (int i = 1; i <= n; ++i) {
//      final int j = n + 1 - i;
//      assert j > 0;
//      res.addAll(multiply(mT.get(i), mT.get(j)));
//    }
//    return res;
//  }
//
//  // (1/x^2)T(x,y)^4
//  private List<Triple<Z>> quartic(final int n) {
//    final List<Triple<Z>> res = new ArrayList<>();
//    for (int i = 1; i < n + 1; ++i) {
//      for (int j = 1; j + i < n + 1; ++j) {
//        for (int k = 1; k + j + i < n + 2; ++k) {
//          final int l = n + 2 - i - j - k;
//          assert l > 0;
//          res.addAll(multiply(multiply(multiply(mT.get(i), mT.get(j)), mT.get(k)), mT.get(l)));
//        }
//      }
//    }
//    return res;
//  }
//
//  @Override
//  public Z next() {
//    return super.next().multiply(24) // updates mN, mT
//      .add((mN & 1) == 0 ? Z.ZERO : eval(substitutePower(mT.get((mN - 1) / 2), 2)).multiply(36))
//      .add(eval(square(mN)).multiply(12))
//      .add(eval(quartic(mN)))
//      .divide(24);
//  }

  @Override
  public Z next() {
    throw new UnsupportedOperationException();
  }
}

