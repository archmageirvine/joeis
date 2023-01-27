package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.transform.RootSequence;

/**
 * A289148 Coefficients of the modular function j_5 = j^5 - 3720*j^4 + 4550940*j^3 - 2028551200*j^2 + 246683410950*j - 1963211493744.
 * @author Georg Fischer
 */
public class A289148 extends AbstractSequence {

  private static final int OFFSET = -5;
  private final A000521 mSeq1;
  private final RootSequence mSeq2;
  private final RootSequence mSeq3;
  private final RootSequence mSeq4;
  private final RootSequence mSeq5;
  private int mN;

  /** Construct the sequence. */
  public A289148() {
    super(OFFSET);
    mSeq1 = new A000521();
    mSeq2 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 2, 1);
    mSeq3 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 3, 1);
    mSeq4 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 4, 1);
    mSeq5 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 5, 1);
    mN = OFFSET - 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ZERO;
    if (mN == 0) {
      result = result.add(-1963211493744L);
    }
    if (mN >= -1) {
      result = result.add(mSeq1.next().multiply(246683410950L));
    }
    if (mN >= -2) {
      result = result.add(mSeq2.next().multiply(-2028551200L));
    }
    if (mN >= -3) {
      result = result.add(mSeq3.next().multiply(4550940));
    }
    if (mN >= -4) {
      result = result.add(mSeq4.next().multiply(-3720L));
    }
    if (mN >= -5) {
      result = result.add(mSeq5.next());
    }
    return result;
  }
}
