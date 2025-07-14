package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.predicate.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078742 a(n) = smallest Fibonacci number &gt; a(n-1) such that a(1) + ... + a(n) is prime.
 * @author Sean A. Irvine
 */
public class A078742 extends Sequence1 {

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
        return mA;
      }
    }
  }
}
