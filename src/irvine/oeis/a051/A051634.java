package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051634 Strong primes: prime(k) &gt; (prime(k-1) + prime(k+1))/2.
 * @author Sean A. Irvine
 */
public class A051634 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mA.compareTo(t.add(mB).divide2()) > 0) {
        return mA;
      }
    }
  }
}

