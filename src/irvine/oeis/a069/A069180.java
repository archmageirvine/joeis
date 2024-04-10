package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000142;

/**
 * A069180 F(n) and n! are relatively prime where F(n) are the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A069180 extends Sequence1 {

  private final Sequence mFactorial = new A000142().skip();
  private final Sequence mFibonacci = new A000045().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mFactorial.next().gcd(mFibonacci.next()).equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}

