package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A068083 a(1) = 1, a(n) is the smallest Fibonacci number of the form k*a(n-1) + 1 with k&gt;0.
 * @author Sean A. Irvine
 */
public class A068083 extends Sequence1 {

  private Z mA = null;
  private final Sequence mFibonacci = new A000045().skip(3);

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (true) {
        final Z f = mFibonacci.next();
        if (f.subtract(1).mod(mA).isZero()) {
          mA = f;
          break;
        }
      }
    }
    return mA;
  }
}

