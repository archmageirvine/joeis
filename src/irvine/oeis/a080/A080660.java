package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080660 Order of group of n X n X n Rubik cube, under assumptions s, m, not-i.
 * @author Sean A. Irvine
 */
public class A080660 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long a = mN / 2;
    final Z e;
    final long f = 1 - (mN & 1);
    if ((mN & 1) == 1) {
      e = Z.valueOf(mN + 1).multiply(mN - 3).divide(4);
    } else {
      e = Z.valueOf(mN).multiply(mN - 2).divide(4);
    }
    return Z.valueOf(44089920)
      .multiply(Z.valueOf(490497638400L).pow(mN & 1))
      .multiply(new Z("310224200866619719680000").pow(e))
      .shiftLeft(11 * (mN & 1))
      .shiftLeft(a)
      .divide(Z.valueOf(24).pow(f));
  }
}
