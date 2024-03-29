package irvine.oeis.a129;
// Generated by gen_seq4.pl dirichcon/dirichinv at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a000.A000688;

/**
 * A129667 Dirichlet inverse of the Abelian group count (A000688).
 * @author Georg Fischer
 */
public class A129667 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A000688());

  /** Construct the sequence. */
  public A129667() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
