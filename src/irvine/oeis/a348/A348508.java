package irvine.oeis.a348;
// Generated by gen_seq4.pl andiv 2023-01-11 22:52

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A348508 a(n) = A003959(n) - 2*n, where A003959 is multiplicative with a(p^e) = (p+1)^e.
 * @author Georg Fischer
 */
public class A348508 extends AbstractSequence {

  private final A348507 mSeq1 = new A348507();
  private int mN;

  /** Construct the sequence. */
  public A348508() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(++mN);
  }
}
