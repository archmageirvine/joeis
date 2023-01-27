package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.transform.RootSequence;

/**
 * A289149 Coefficients of the modular function j_6 = j^6 - 4464*j^5 + 7121736*j^4 - 4850017536*j^3 + 1304194222980*j^2 - 96687754014528*j + 453039686271072.
 * @author Georg Fischer
 */
public class A289149 extends AbstractSequence {

  private static final int OFFSET = -6;
  private final A000521 mSeq1;
  private final RootSequence mSeq2;
  private final RootSequence mSeq3;
  private final RootSequence mSeq4;
  private final RootSequence mSeq5;
  private final RootSequence mSeq6;
  private int mN;

  /** Construct the sequence. */
  public A289149() {
    super(OFFSET);
    mSeq1 = new A000521();
    mSeq2 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 2, 1);
    mSeq3 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 3, 1);
    mSeq4 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 4, 1);
    mSeq5 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 5, 1);
    mSeq6 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 6, 1);
    mN = OFFSET - 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ZERO;
    if (mN == 0) {
      result = result.add(453039686271072L);
    }
    if (mN >= -1) {
      result = result.add(mSeq1.next().multiply(-96687754014528L));
    }
    if (mN >= -2) {
      result = result.add(mSeq2.next().multiply(1304194222980L));
    }
    if (mN >= -3) {
      result = result.add(mSeq3.next().multiply(-4850017536L));
    }
    if (mN >= -4) {
      result = result.add(mSeq4.next().multiply(7121736L));
    }
    if (mN >= -5) {
      result = result.add(mSeq5.next().multiply(-4464L));
    }
    if (mN >= -6) {
      result = result.add(mSeq6.next());
    }
    return result;
  }
}
