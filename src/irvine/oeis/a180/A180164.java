package irvine.oeis.a180;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a275.A275315;

/**
 * A180164 The sum of the two numbers in an amicable pair, A002025(n) + A002046(n).
 * @author Georg Fischer
 */
public class A180164 extends AbstractSequence {

  private final AbstractSequence mSeq = new A275315();

  /** Construct the sequence. */
  public A180164() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().multiply2();
  }
}
