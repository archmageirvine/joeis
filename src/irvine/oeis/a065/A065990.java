package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004604;

/**
 * A065990 The first n base-5 digits of Pi expressed in decimal forms a prime.
 * @author Sean A. Irvine
 */
public class A065990 extends Sequence1 {

  private final Sequence mPiBinary = new A004604();
  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(5).add(mPiBinary.next());
      if (mA.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
