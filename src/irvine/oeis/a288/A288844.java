package irvine.oeis.a288;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.transform.RootSequence;

/**
 * A288844 Coefficients of the modular function j_3 = j^3 - 2232*j^2 + 1069956*j - 36866976.
 * @author Georg Fischer
 */
public class A288844 extends AbstractSequence {

  private static final int OFFSET = -3;
  private final A000521 mSeq1;
  private final RootSequence mSeq2;
  private final RootSequence mSeq3;
  private int mN;

  /** Construct the sequence. */
  public A288844() {
    super(OFFSET);
    mSeq1 = new A000521();
    mSeq2 = new RootSequence(OFFSET, new A000521().skip(1), 2, 1);
    mSeq3 = new RootSequence(OFFSET, new A000521().skip(1), 3, 1);
    mN = OFFSET - 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ZERO;
    if (mN == 0) {
      result = result.add(-36866976L);
    }
    if (mN >= -1) {
      result = result.add(mSeq1.next().multiply(1069956L));
    }
    if (mN >= -2) {
      result = result.add(mSeq2.next().multiply(-2232L));
    }
    if (mN >= -3) {
      result = result.add(mSeq3.next());
    }
    return result;
  }
}
