package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000959;

/**
 * A032606 Lucky numbers indexed by prime numbers.
 * @author Sean A. Irvine
 */
public class A032606 extends A000959 {

  private final Sequence mPrimes = new A000040();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z l = mPrimes.next();
    Z p;
    do {
      p = super.next();
      mN = mN.add(1);
    } while (mN.compareTo(l) < 0);
    return p;
  }
}
