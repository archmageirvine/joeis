package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082234 In the following square array numbers are entered like this a(1,1),a(1,2),a(2,1),a(3,1),a(2,2),a(1,3),a(1,4),a(2,3),a(3,2),a(4,1),a(5,1),a(4,2),... such that every entry is the geometric mean of the two diametrically opposite neighbors (wherever a pair exists). 1 2 4 8 16 32 64... 3 6 12 24 48 96 192... 9 18 36 72 144 288 576... 27 54 108 216 432 864 1728... ... Sequence contains numbers as they are entered.
 * @author Sean A. Irvine
 */
public class A082234 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    return Z.THREE.pow(n).shiftLeft(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return (mN & 1) == 0 ? t(mN - mM, mM) : t(mM, mN - mM);
  }
}
