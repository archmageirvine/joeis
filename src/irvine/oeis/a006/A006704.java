package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A006704 Solution to Pellian: x such that <code>x^2 - n y^2 = +- 1, +- 4</code>.
 * @author Sean A. Irvine
 */
public class A006704 extends A006702 {

  static Pair<Z, Z> pq(final Z p0, final Z q0, final Z d) {
    final CR sqrtD = CR.valueOf(d).sqrt();
    Z a0 = Z.ZERO;
    Z a1 = Z.ONE;
    Z b0 = Z.ONE;
    Z b1 = Z.ZERO;
    Z g0 = p0.negate();
    Z g1 = q0;
    Z p = p0;
    Z q = q0;
    Z aa = null;
    while (true) {
      final Z a = sqrtD.add(CR.valueOf(p)).divide(CR.valueOf(q)).floor(32);
      if (aa == null) {
        aa = a.multiply2().subtract(1);
      }
      final Z at = a.multiply(a1).add(a0);
      final Z bt = a.multiply(b1).add(b0);
      final Z gt = a.multiply(g1).add(g0);
      a0 = a1;
      a1 = at;
      b0 = b1;
      b1 = bt;
      g0 = g1;
      g1 = gt;
      p = a.multiply(q).subtract(p);
      q = d.subtract(p.square()).divide(q);
      if (Z.TWO.equals(q)) {
        return new Pair<>(g1, b1);
      }
    }
  }

  @Override
  public Z next() {
    final Z solve1 = super.next();
    if (Z.ONE.equals(solve1)) {
      return Z.ONE;
    }
    final Z v;
    switch ((int) (mN & 3)) {
      case 0:
        v = solve(mN / 4).num().multiply2();
        break;
      case 1:
        v = pq(Z.ONE, Z.TWO, Z.valueOf(mN)).left();
        break;
      default:
        v = solve1; //solve(mN).num().multiply2(); // no point? -- always be bigger than existing soln
        break;
    }
    return solve1.min(v);
  }
}
