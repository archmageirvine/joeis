package irvine.oeis.a359;
// manually dirichcon/dirichinv at 2023-06-04 21:04

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a035.A035263;

/**
 * A359592 Parity (and also absolute values) of Dirichlet inverse of A035263, where A035263(n) is parity of 2-adic valuation of 2n.
 * @author Georg Fischer
 */
public class A359592 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A035263());

  /** Construct the sequence. */
  public A359592() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().and(Z.ONE);
  }
}
