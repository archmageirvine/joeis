package irvine.oeis.a288;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.transform.RootSequence;

/**
 * A288843 Coefficients of the modular function j_2 = j^2 - 1488*j + 159768.
 * @author Georg Fischer
 */
public class A288843 extends AbstractSequence {

  private static final int OFFSET = -2;
  private final A000521 mSeq1;
  private final RootSequence mSeq2;
  private int mN;

  /** Construct the sequence. */
  public A288843() {
    super(OFFSET);
    mSeq1 = new A000521();
    mSeq2 = new RootSequence(OFFSET, new A000521().skip(1), 2, 1);
    mN = OFFSET - 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ZERO;
    if (mN == 0) {
      result = result.add(159768L);
    }
    if (mN >= -1) {
      result = result.add(mSeq1.next().multiply(-1488L));
    }
    if (mN >= -2) {
      result = result.add(mSeq2.next());
    }
    return result;
  }
}
