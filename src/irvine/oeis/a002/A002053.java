package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002053 a(n) = least value of m for which Liouville's function A002819(m) = -n.
 * @author Sean A. Irvine
 */
public class A002053 implements Sequence {

  private long mN = 1;
  private long mLiouville = 1;
  private long mM = 1;

  @Override
  public Z next() {
    --mN;
    while (mLiouville != mN) {
      final long omega = Jaguar.factor(++mM).bigOmega();
      if ((omega & 1) == 0) {
        ++mLiouville;
      } else {
        --mLiouville;
      }
    }
    return Z.valueOf(mM);
  }
}
