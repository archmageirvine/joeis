package irvine.oeis.a104;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a136.A136798;

/**
 * A104280 Numbers n such that 2n+1 is not prime and 2n-1 is prime.
 * @author Georg Fischer
 */
public class A104280 extends AbstractSequence {

  private final AbstractSequence mSeq = new A136798();

  /** Construct the sequence. */
  public A104280() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
