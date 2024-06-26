package irvine.oeis.a061;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007978;
import irvine.oeis.a053.A053669;

/**
 * A061853 Difference between smallest prime not dividing n and smallest nondivisor of n.
 * @author Georg Fischer
 */
public class A061853 extends AbstractSequence {

  private final A053669 mSeq1 = new A053669();
  private final A007978 mSeq2 = new A007978();

  /** Construct the sequence. */
  public A061853() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
