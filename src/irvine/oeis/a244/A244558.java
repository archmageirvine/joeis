package irvine.oeis.a244;
// Generated by gen_seq4.pl nesta at 2023-10-19 23:23

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a048.A048385;

/**
 * A244558 Numbers obtained by concatenating the squares of the digits of Fibonacci(n).
 * Formula: <code>a(n) = A048385(A000045(n)).</code>
 * @author Georg Fischer
 */
public class A244558 extends AbstractSequence {

  private final A048385 mSeq1 = new A048385();
  private final AbstractSequence mSeq2 = new A000045().skip(1);

  /** Construct the sequence. */
  public A244558() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.a(mSeq2.next());
  }
}
