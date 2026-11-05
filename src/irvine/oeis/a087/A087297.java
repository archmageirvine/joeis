package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A087297 Add the next prime and multiply by the next prime.
 * @author Sean A. Irvine
 */
public class A087297 extends Sequence0 {

  private final Sequence mPrimes = new A000040();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z p = mPrimes.next();
      mA = mA.add(p).multiply(p);
    }
    return mA;
  }
}
