package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066793 The start of a record-breaking run of consecutive integers with an even number of prime factors.
 * @author Sean A. Irvine
 */
public class A066793 extends Sequence1 {

  private long mMax = -1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      while ((Jaguar.factor(++mN).bigOmega() & 1) == 0) {
        ++cnt;
      }
      if (cnt > mMax) {
        mMax = cnt;
        return Z.valueOf(mN - cnt);
      }
    }
  }
}

