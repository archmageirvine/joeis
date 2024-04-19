package irvine.oeis.a359;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A359378 Dirichlet inverse of A359377, where A359377(n) = 1 if 3*n is squarefree, otherwise 0.
 * @author Georg Fischer
 */
public class A359378 extends AbstractSequence {

  private final A359170 mSeq1 = new A359170();
  private final A359172 mSeq2 = new A359172();

  /** Construct the sequence. */
  public A359378() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
