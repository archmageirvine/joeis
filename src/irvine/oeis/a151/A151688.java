package irvine.oeis.a151;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a152.A152980;

/**
 * A151688 G.f.: Product_{n&gt;=0} (1 + x^(2^n-1) + 2*x^(2^n)).
 * @author Georg Fischer
 */
public class A151688 extends AbstractSequence {

  private final AbstractSequence mSeq = new A152980();

  /** Construct the sequence. */
  public A151688() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq.next().multiply2();
  }
}
