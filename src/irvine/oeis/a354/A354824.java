package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-07-11/dirichinv0 at 2024-07-11 18:00

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a351.A351084;

/**
 * A354824 Dirichlet inverse of A351084, where A351084(n) = gcd(n, A328572(n)), and A328572 converts the primorial base expansion of n into its prime product form, but with 1 subtracted from all nonzero digits.
 * @author Georg Fischer
 */
public class A354824 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A351084().skip(1));

  /** Construct the sequence. */
  public A354824() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
