package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082234 In the following square array numbers are entered like this A(1,1), A(1,2), A(2,1), A(3,1), A(2,2), A(1,3), A(1,4), A(2,3), A(3,2), A(4,1), A(5,1), A(4,2), ... such that every entry is the geometric mean of the two diametrically opposite neighbors (wherever a pair exists).
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
