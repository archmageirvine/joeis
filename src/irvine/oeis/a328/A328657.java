package irvine.oeis.a328;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a056.A056362;
import irvine.oeis.a056.A056514;

/**
 * A328657 Number of primitive (period n) n-bead bracelet structures which are not periodic palindromes using a maximum of three different colored beads.
 * @author Georg Fischer
 */
public class A328657 extends AbstractSequence {

  private final A056362 mSeq1 = new A056362();
  private final A056514 mSeq2 = new A056514();

  /** Construct the sequence. */
  public A328657() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
