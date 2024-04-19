package irvine.oeis.a083;
// manually amoda 2023-06-11

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a058.A058635;
import irvine.oeis.a058.A058891;

/**
 * A083697 a(n) = 2^(2^n - 1) * Fibonacci(2^n).
 * @author Georg Fischer
 */
public class A083697 extends AbstractSequence {

  private final A058635 mSeq1 = new A058635();
  private final A058891 mSeq2 = new A058891();

  /** Construct the sequence. */
  public A083697() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
