package irvine.oeis.a163;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a280.A280968;

/**
 * A163656 Arithmetic mean of the n-th and (n+1)st twin prime member A001097.
 * @author Georg Fischer
 */
public class A163656 extends AbstractSequence {

  private final AbstractSequence mSeq = new A280968();

  /** Construct the sequence. */
  public A163656() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
