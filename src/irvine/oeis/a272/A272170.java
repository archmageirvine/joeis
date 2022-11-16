package irvine.oeis.a272;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A272170 Second most significant bit of Fibonacci numbers &gt; 1 written in base 2.
 * @author Georg Fischer
 */
public class A272170 extends A000045 {

  {
    setOffset(3);
  }

  /** Construct the sequence. */
  public A272170() {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z fib = super.next();
    return fib.testBit(fib.bitLength() - 2) ? Z.ONE : Z.ZERO;
  }
}
