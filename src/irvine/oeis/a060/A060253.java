package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A060253 Numbers n such that difference between n-th prime and n-th composite number is prime.
 * @author Sean A. Irvine
 */
public class A060253 extends Sequence1 {

  private final Sequence mPrimes = new A000040();
  private final Sequence mComposites = new A002808();
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mPrimes.next().subtract(mComposites.next()).abs().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
