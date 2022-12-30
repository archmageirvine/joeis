package irvine.oeis.a173;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060632;

/**
 * A173531 a(0)=0: For n&gt;0, a(n) = A060632(n)*A060632(n-1).
 * @author Georg Fischer
 */
public class A173531 extends AbstractSequence {

  private int mN = -1;
  private final A060632 mSeq1 = new A060632();
  private Z mA;

  /** Construct the sequence. */
  public A173531() {
    super(0);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z b = mSeq1.next();
    final Z result = b.multiply(mA);
    mA = b;
    return result;
  }
}
