package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-07-11/dirichinv at 2024-07-11 18:00

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a293.A293442;

/**
 * A354825 Dirichlet inverse of A293442, where A293442 is multiplicative with a(p^e) = A019565(e).
 * @author Georg Fischer
 */
public class A354825 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A293442());

  /** Construct the sequence. */
  public A354825() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
