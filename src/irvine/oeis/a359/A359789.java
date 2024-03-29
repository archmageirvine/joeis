package irvine.oeis.a359;
// Generated by gen_seq4.pl dirichcon/dirichinv at 2023-06-04 22:05

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a036.A036288;

/**
 * A359789 Dirichlet inverse of A036288, where A036288(n) = 1 + sopfr(n), where sopfr is the sum of prime divisors with repetition, A001414.
 * @author Georg Fischer
 */
public class A359789 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A036288());

  /** Construct the sequence. */
  public A359789() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
