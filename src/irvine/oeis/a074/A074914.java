package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074897.
 * @author Sean A. Irvine
 */
public class A074914 extends Sequence1 {

  private static final Z C1 = Z.valueOf(88179840);
  private static final Z C2 = Z.valueOf(490497638400L);
  private static final Z C3 = new Z("310224200866619719680000");
  private static final Z C4 = Z.valueOf(24);
  private long mN = 0;

  @Override
  public Z next() {
    final long a = ++mN / 2;
    final long c;
    final Z e;
    final long f;
    if ((mN & 1) == 1) {
      c = a;
      e = Z.valueOf(mN + 4).multiply(mN - 1).multiply(mN - 3).divide(24);
      f = 0;
    } else {
      c = 0;
      e = Z.valueOf(mN).multiply(mN * mN - 4).divide(24);
      f = 1;
    }
    return C1.pow(a).multiply(C2.pow(c)).multiply(C3.pow(e)).divide(C4.pow(f));
  }
}
