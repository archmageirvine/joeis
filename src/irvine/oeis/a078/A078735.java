package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078735 a(0) = 0, a(1) = 3; a(n+1) = the smallest x such that Fibonacci(x)-Fibonacci(a(n)) is both prime and greater than Fibonacci(a(n))-Fibonacci(a(n-1)).
 * @author Sean A. Irvine
 */
public class A078735 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.THREE;
      return mB;
    }
    final Z min = Functions.FIBONACCI.z(mB).subtract(Functions.FIBONACCI.z(mA));
    Z t = mB;
    while (true) {
      t = t.add(1);
      final Z f = Functions.FIBONACCI.z(t).subtract(Functions.FIBONACCI.z(mB));
      if (f.compareTo(min) > 0 && f.isProbablePrime()) {
        mA = mB;
        mB = t;
        return t;
      }
    }
  }
}

