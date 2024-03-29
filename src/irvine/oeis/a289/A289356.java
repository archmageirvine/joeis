package irvine.oeis.a289;
// Generated by gen_seq4.pl nesta at 2023-10-19 23:23

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002378;
import irvine.oeis.a013.A013632;

/**
 * A289356 Least number k such that n^2 + n + k is prime.
 * Formula: <code>a(n) = A013632(A002378(n)).</code>
 * @author Georg Fischer
 */
public class A289356 extends AbstractSequence {

  private final A013632 mSeq1 = new A013632();
  private final AbstractSequence mSeq2 = new A002378();

  /** Construct the sequence. */
  public A289356() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.a(mSeq2.next());
  }
}
