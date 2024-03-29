package irvine.oeis.a088;
// Generated by gen_seq4.pl simgcd at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a045.A045769;

/**
 * A088832 Numbers n whose abundance is 4: sigma(n) - 2n = 4.
 * @author Georg Fischer
 */
public class A088832 extends AbstractSequence {

  private final AbstractSequence mSeq = new A045769().skip(3);

  /** Construct the sequence. */
  public A088832() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
