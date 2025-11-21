package irvine.oeis.a081;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081976 For n &gt; 2, a(n) is minimal so that the products of two adjacent terms are distinct Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A081976 extends Sequence1 {

  private final HashSet<Z> mSeenFibonacci = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    long k = 2;
    while (true) {
      final Z f = Functions.FIBONACCI.z(++k);
      if (!mSeenFibonacci.contains(f)) {
        final Z[] qr = f.divideAndRemainder(mA);
        if (qr[1].isZero()) {
          mSeenFibonacci.add(f);
          mA = qr[0];
          return mA;
        }
      }
    }
  }
}
