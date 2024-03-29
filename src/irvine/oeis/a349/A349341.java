package irvine.oeis.a349;
// Generated by gen_seq4.pl dirichcon/dirichinv0 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a026.A026741;

/**
 * A349341 Dirichlet inverse of A026741, which is defined as n if n is odd, n/2 if n is even.
 * @author Georg Fischer
 */
public class A349341 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A026741().skip(1));

  /** Construct the sequence. */
  public A349341() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
