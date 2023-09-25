package irvine.oeis.a359;
// manually robots/dirichinv at 2023-09-24 22:04

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;

/**
 * A359834 Parity of Dirichlet inverse of A359832, where A359832(n) = 1 if the 2-adic valuation of n is either 0 or odd, otherwise 0.
 * @author Georg Fischer
 */
public class A359834 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A359832());

  /** Construct the sequence. */
  public A359834() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
