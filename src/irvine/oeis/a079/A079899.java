package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A079899 a(1) = 1; a(n) = Fibonacci(n) - Fibonacci(n-1)* a(n-1) if n > 1.
 * @author Georg Fischer
 */
public class A079899 extends Sequence1 {

  private int mN = 0;
  private Sequence mSeq = new A000045();
  private Z mFib;
  private Z mA;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mFib = mSeq.next();
      mA = Z.ONE;
    }
    final Z fib2 = mSeq.next();
    final Z result = fib2.subtract(mFib.multiply(mA));
    mFib = fib2;
    mA = result;
    return result;
  }
}
