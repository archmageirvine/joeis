package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000142;

/**
 * A064738 Numbers k such that k! + Fibonacci(k) is prime.
 * @author Sean A. Irvine
 */
public class A064738 extends Sequence1 {

  private final Sequence mFibonacci = new A000045();
  private final Sequence mFactorial = new A000142();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mFactorial.next().add(mFibonacci.next()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

