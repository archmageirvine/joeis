package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006705 Solution to Pellian: y such that <code>x^2 - n y^2 = +- 1, +- 4</code>.
 * @author Sean A. Irvine
 */
public class A006705 extends A006703 {

  @Override
  public Z next() {
    final Z solve1 = super.next();
    if (Z.ZERO.equals(solve1)) {
      return Z.ZERO;
    }
    final Z v;
    switch ((int) (mN & 3)) {
      case 0:
        v = solve(mN / 4).den();
        break;
      case 1:
        v = A006704.pq(Z.ONE, Z.TWO, Z.valueOf(mN)).right();
        break;
      default:
        v = solve1;
        break;

    }
    return solve1.min(v);
  }
}
