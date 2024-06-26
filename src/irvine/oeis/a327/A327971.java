package irvine.oeis.a327;
// Generated by gen_seq4.pl amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a110.A110240;
import irvine.oeis.a265.A265281;

/**
 * A327971 Bitwise XOR of trajectories of rule 30 and its mirror image, rule 86, when both are started from a lone 1 cell: a(n) = A110240(n) XOR A265281(n).
 * @author Georg Fischer
 */
public class A327971 extends AbstractSequence {

  private final A110240 mSeq1 = new A110240();
  private final A265281 mSeq2 = new A265281();

  /** Construct the sequence. */
  public A327971() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().xor(mSeq2.next());
  }
}
