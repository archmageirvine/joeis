package irvine.oeis.a088;
// Generated by gen_seq4.pl andiv 2023-01-11 22:52

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060265;

/**
 * A088631 Largest number m &lt; n such that m+n is a prime.
 * @author Georg Fischer
 */
public class A088631 extends AbstractSequence {

  private final A060265 mSeq1 = new A060265();
  private int mN;

  /** Construct the sequence. */
  public A088631() {
    super(2);
    mN = 1;
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(++mN);
  }
}
