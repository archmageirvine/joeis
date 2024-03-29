package irvine.oeis.a217;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060389;

/**
 * A217723 a(n) = (sum of first n primorial numbers) minus 1.
 * @author Georg Fischer
 */
public class A217723 extends AbstractSequence {

  private final AbstractSequence mSeq = new A060389();

  /** Construct the sequence. */
  public A217723() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(1);
  }
}
