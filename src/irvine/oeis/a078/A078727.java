package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.predicate.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078727 Smallest prime a(n) &gt; a(n-1) such that a(1) + ... + a(n) is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A078727 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      int ti = Math.abs(Fibonacci.inverseFibonacci(mSum.add(mA)));
      while (true) {
        final Z f = Functions.FIBONACCI.z(ti);
        final Z r = f.subtract(mSum);
        if (r.compareTo(mA) > 0 && r.isProbablePrime()) {
          mA = r;
          break;
        }
        ++ti;
      }
    }
    mSum = mSum.add(mA);
    return mA;
  }
}
