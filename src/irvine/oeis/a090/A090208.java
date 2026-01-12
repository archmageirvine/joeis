package irvine.oeis.a090;
// manually 2026-01-11

import irvine.math.z.Z;

/**
 * A090208 Partial sums of sequence (A090206) of consecutive nonprime Fibonacci numbers.
 * @author Georg Fischer
 */
public class A090208 extends A090206 {

  private Z mA; // previous term

  /** Construct the sequence. */
  public A090208() {
    mA = super.next();
  }

  @Override
  public Z next() {
    final Z b = super.next();
    final Z result = mA.add(b);
    mA = b;
    return result;
  }
}
