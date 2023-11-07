package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066794 Start of a record-breaking run of consecutive integers with an odd number of prime factors.
 * @author Sean A. Irvine
 */
public class A066794 extends Sequence1 {

  private long mMax = -1;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      while ((Jaguar.factor(++mN).bigOmega() & 1) == 1) {
        ++cnt;
      }
      if (cnt > mMax) {
        mMax = cnt;
        return Z.valueOf(mN - cnt);
      }
    }
  }
}

