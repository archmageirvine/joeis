package irvine.oeis.a334;
// manually anopsn 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a064.A064415;

/**
 * A334195 a(1) = 0, then after the first differences of A064415.
 * @author Georg Fischer
 */
public class A334195 extends AbstractSequence {

  private int mN = 0;
  private final A064415 mSeq1 = new A064415();
  private Z mA;

  /** Construct the sequence. */
  public A334195() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
