package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.predicate.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078743 a(n) is the Fibonacci index of b(n) in the sequence b(1), b(2), ... where b(n) is the smallest Fibonacci number &gt; b(n-1) such that b(1) + ... + b(n) is prime.
 * @author Sean A. Irvine
 */
public class A078743 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    int i = Math.abs(Fibonacci.inverseFibonacci(mA));
    while (true) {
      mA = Functions.FIBONACCI.z(++i);
      final Z t = mSum.add(mA);
      if (t.isProbablePrime()) {
        mSum = t;
        return Z.valueOf(i);
      }
    }
  }
}
