package irvine.oeis.a323;
// Generated by gen_seq4.pl dirichcon/dirichinv0 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a004.A004718;

/**
 * A323886 Dirichlet inverse of A004718, Per N\u00f8rg\u00e5rd's "infinity sequence".
 * @author Georg Fischer
 */
public class A323886 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A004718().skip(1));

  /** Construct the sequence. */
  public A323886() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
