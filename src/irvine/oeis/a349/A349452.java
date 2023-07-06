package irvine.oeis.a349;
// manually dirichcon/dirichinv at 2023-03-25 20:44

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a011.A011782;

/**
 * A349452 Dirichlet inverse of A011782, 2^(n-1).
 * @author Georg Fischer
 */
public class A349452 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A011782().skip(1));

  /** Construct the sequence. */
  public A349452() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
