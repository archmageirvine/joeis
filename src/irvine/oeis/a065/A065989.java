package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004602;

/**
 * A065989 The first n ternary digits of Pi expressed in decimal forms a prime.
 * @author Sean A. Irvine
 */
public class A065989 extends Sequence1 {

  private final Sequence mPiBinary = new A004602();
  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(3).add(mPiBinary.next());
      if (mA.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
