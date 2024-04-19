package irvine.oeis.a090;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a011.A011782;

/**
 * A090129 Smallest exponent such that -1 + 3^a(n) is divisible by 2^n.
 * @author Georg Fischer
 */
public class A090129 extends AbstractSequence {

  private int mN = 0;
  private final A011782 mSeq1 = new A011782();

  /** Construct the sequence. */
  public A090129() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN <= 1) ? Z.ONE : mSeq1.next().multiply2();
  }
}
