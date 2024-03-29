package irvine.oeis.a265;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A265027 First differences of A048701 divided by 6.
 * @author Georg Fischer
 */
public class A265027 extends AbstractSequence {

  private final AbstractSequence mSeq = new A265026().skip(1);

  /** Construct the sequence. */
  public A265027() {
    super(2);
  }

  @Override
  public Z next() {
    return mSeq.next().divide(6);
  }
}
