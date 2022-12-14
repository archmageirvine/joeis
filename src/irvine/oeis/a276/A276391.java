package irvine.oeis.a276;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000695;

/**
 * A276391 G.f. satisfies A(x) - 4*A(x^2) = x/(1+x).
 * @author Georg Fischer
 */
public class A276391 extends AbstractSequence {

  private A000695 mSeq1 = new A000695();
  private Z mA;
  private int mN = 0;

  /** Construct the sequence. */
  public A276391() {
    super(1);
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
