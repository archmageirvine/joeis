package irvine.oeis.a273;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006257;
import irvine.oeis.a038.A038572;

/**
 * A273105 a(n) = A038572(n) + A006257(n), sum of the two numbers obtained by rotating the binary representation of n by one place to the right and to the left.
 * @author Georg Fischer
 */
public class A273105 extends AbstractSequence {

  private final A038572 mSeq1 = new A038572();
  private final A006257 mSeq2 = new A006257();

  /** Construct the sequence. */
  public A273105() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
