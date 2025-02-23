package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-01-03.ack/dirichinv0 at 2025-01-06 00:11

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a033.A033630;

/**
 * A378437 Dirichlet inverse of A033630, where A033630 is the number of partitions of n into distinct divisors of n.
 * @author Georg Fischer
 */
public class A378437 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A033630().skip(1));

  /** Construct the sequence. */
  public A378437() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
