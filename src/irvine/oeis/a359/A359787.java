package irvine.oeis.a359;
// manually dirichcon/dirichinv at 2023-06-04 21:04

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a075.A075255;

/**
 * A359787 Parity of Dirichlet inverse of A075255, where A075255(n) = n - sopfr(n), where sopfr is the sum of prime factors (with repetition).
 * @author Georg Fischer
 */
public class A359787 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A075255());

  /** Construct the sequence. */
  public A359787() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().and(Z.ONE);
  }
}
