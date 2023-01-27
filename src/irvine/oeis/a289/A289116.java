package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.transform.RootSequence;

/**
 * A289116 Coefficients of the modular function j_4 = j^4 - 2976*j^3 + 2533680*j^2 - 561444608*j + 8507424792.
 * @author Georg Fischer
 */
public class A289116 extends AbstractSequence {

  private static final int OFFSET = -4;
  private final A000521 mSeq1;
  private final RootSequence mSeq2;
  private final RootSequence mSeq3;
  private final RootSequence mSeq4;
  private int mN;

  /** Construct the sequence. */
  public A289116() {
    super(OFFSET);
    mSeq1 = new A000521();
    mSeq2 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 2, 1);
    mSeq3 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 3, 1);
    mSeq4 = new RootSequence(OFFSET, new SkipSequence(new A000521(), 1), 4, 1);
    mN = OFFSET - 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ZERO;
    if (mN == 0) {
      result = result.add(8507424792L);
    }
    if (mN >= -1) {
      result = result.add(mSeq1.next().multiply(-561444608L));
    }
    if (mN >= -2) {
      result = result.add(mSeq2.next().multiply(2533680L));
    }
    if (mN >= -3) {
      result = result.add(mSeq3.next().multiply(-2976L));
    }
    if (mN >= -4) {
      result = result.add(mSeq4.next());
    }
    return result;
  }
}
