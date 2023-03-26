package irvine.oeis.a346;
// manually dirichcon/dirichinv at 2023-03-25 20:24

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a252.A252748;
import irvine.oeis.transform.NegationTransformSequence;

/**
 * A346248 Dirichlet inverse of -A252748, 2*n - A003961(n).
 * @author Georg Fischer
 */
public class A346248 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new NegationTransformSequence(new A252748()));

  /** Construct the sequence. */
  public A346248() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
