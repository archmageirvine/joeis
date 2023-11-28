package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066963 Start of a record-breaking run of consecutive composite integers with an odd number of prime factors.
 * @author Sean A. Irvine
 */
public class A066963 extends Sequence1 {

  private long mN = 7;
  private long mRecord = 0;

  @Override
  public Z next() {
    while (true) {
      final long m = ++mN;
      while (true) {
        final long bigOmega = Jaguar.factor(mN).bigOmega();
        if (bigOmega == 1 || (bigOmega & 1) == 0) {
          break;
        }
        ++mN;
      }
      if (mN - m > mRecord) {
        mRecord = mN - m;
        return Z.valueOf(m);
      }
    }
  }
}
