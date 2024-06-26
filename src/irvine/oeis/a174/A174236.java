package irvine.oeis.a174;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a045.A045753;
import irvine.oeis.a123.A123986;

/**
 * A174236 n-th number k such that k*4-+1 is twin prime pair plus n-th number m such that m*4+2-+1 is twin prime pair.
 * @author Georg Fischer
 */
public class A174236 extends AbstractSequence {

  private final A045753 mSeq1 = new A045753();
  private final A123986 mSeq2 = new A123986();

  /** Construct the sequence. */
  public A174236() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
