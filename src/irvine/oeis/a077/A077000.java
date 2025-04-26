package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.predicate.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077000 a(n) = Fibonacci index of A076999(n).
 * @author Sean A. Irvine
 */
public class A077000 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else {
      mA = mA.multiply(++mN);
      final int index = Fibonacci.inverseFibonacci(mA);
      if (index < 0) {
        int k = -index;
        while (Functions.FIBONACCI.z(k).compareTo(mA) <= 0) {
          ++k;
        }
        mA = Functions.FIBONACCI.z(k - 1);
        return Z.valueOf(k - 1);
      } else {
        return Z.valueOf(index);
      }
    }
  }
}

