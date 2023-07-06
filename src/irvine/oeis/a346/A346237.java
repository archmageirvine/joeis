package irvine.oeis.a346;
// manually dirichcon/dirichinv at 2023-03-25 20:44

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a005.A005187;

/**
 * A346237 Dirichlet inverse of A005187.
 * @author Georg Fischer
 */
public class A346237 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A005187().skip(1));

  /** Construct the sequence. */
  public A346237() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
