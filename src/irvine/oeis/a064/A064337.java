package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064337 Minimal prime numbers with increasing prime differences.
 * @author Sean A. Irvine
 */
public class A064337 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mPrime.nextPrime(mA.add(super.next()));
    return mA;
  }
}
