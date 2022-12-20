package irvine.oeis.a088;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a008.A008548;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A088992 Derangement numbers d(n,5) where d(n,k) = k(n-1)(d(n-1,k) + d(n-2,k)), with d(0,k) = 1 and d(1,k) = 0.
 * @author Georg Fischer
 */
public class A088992 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A008548(), 0);

  /** Construct the sequence. */
  public A088992() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
