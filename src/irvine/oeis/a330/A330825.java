package irvine.oeis.a330;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001146;
import irvine.oeis.a019.A019434;

/**
 * A330825 Numbers of the form 2^(2^n)*F_n, where F_n is a Fermat prime, A019434.
 * @author Georg Fischer
 */
public class A330825 extends AbstractSequence {

  private A001146 mSeq1 = new A001146();
  private A019434 mSeq2 = new A019434();

  /** Construct the sequence. */
  public A330825() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
