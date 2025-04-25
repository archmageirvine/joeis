package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076999 a(1) = 1, a(n+1) is the largest Fibonacci number &lt;= n*a(n).
 * @author Sean A. Irvine
 */
public class A076999 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(++mN);
      final int index = Fibonacci.inverseFibonacci(mA);
      if (index < 0) {
        int k = -index;
        while (Functions.FIBONACCI.z(k).compareTo(mA) <= 0) {
          ++k;
        }
        mA = Functions.FIBONACCI.z(k - 1);
      }
    }
    return mA;
  }
}

