package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004601;

/**
 * A117721 Primes formed by the initial digits of the binary expansion of Pi.
 * @author Sean A. Irvine
 */
public class A117721 extends Sequence1 {

  private final Sequence mPiBinary = new A004601();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply2().add(mPiBinary.next());
      if (mA.isProbablePrime()) {
        return mA;
      }
    }
  }
}
