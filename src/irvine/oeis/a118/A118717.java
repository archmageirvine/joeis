package irvine.oeis.a118;
// Generated by gen_seq4.pl anopsn 1, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001358;

/**
 * A118717 Sum of two consecutive semiprimes.
 * @author Georg Fischer
 */
public class A118717 extends AbstractSequence {

  private final A001358 mSeq1 = new A001358();
  private Z mA;

  /** Construct the sequence. */
  public A118717() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
