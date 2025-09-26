package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080659 Order of group of n X n X n Rubik cube, under assumptions s, m, i.
 * @author Sean A. Irvine
 */
public class A080659 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long a = mN / 2;
    final Z e;
    final long d;
    if ((mN & 1) == 1) {
      e = Z.valueOf(mN + 4).multiply(mN - 1).multiply(mN - 3).divide(24);
      d = a;
    } else {
      e = Z.valueOf(mN).multiply(mN * mN - 4).divide(24);
      d = 0;
    }
    return Z.valueOf(44089920).pow(a)
      .multiply(Z.valueOf(490497638400L).pow(a * (mN & 1)))
      .multiply(new Z("310224200866619719680000").pow(e))
      .shiftLeft(11 * d)
      .shiftLeft(a)
      .divide(Z.valueOf(24).pow(1 - (mN & 1)));
  }
}
