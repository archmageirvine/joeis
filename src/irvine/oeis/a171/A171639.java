package irvine.oeis.a171;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a018.A018252;

/**
 * A171639 Sum of n-th nonprime number and n-th noncomposite number.
 * @author Georg Fischer
 */
public class A171639 extends AbstractSequence {

  private final A008578 mSeq1 = new A008578();
  private final A018252 mSeq2 = new A018252();

  /** Construct the sequence. */
  public A171639() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
