package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A083659.
 * @author Sean A. Irvine
 */
public class A083677 extends Sequence1 {

  private final DirectSequence mS = new A007504();
  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 3 || (mN % 3 == 1 && mS.a(mN).mod(3) == 0)) {
      return Z.NEG_ONE;
    }
    long k = -1;
    while (true) {
      ++k;
      final StringBuilder sb = new StringBuilder();
      long p = 2;
      for (int j = 0; j < mN; ++j, p = mPrime.nextPrime(p)) {
        if (j != 0) {
          sb.append(k);
        }
        sb.append(p);
      }
      if (new Z(sb).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
