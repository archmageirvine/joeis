package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000869.
 * @author Sean A. Irvine
 */
public class A000869 implements Sequence {

  private static final Z TWENTY_ONE = Z.valueOf(21);
  private static final Z TWENTY_TWO = Z.valueOf(22);
  private static final Z FORTY_TWO = Z.valueOf(42);
  private static final Z FORTY_EIGHT = Z.valueOf(48);
  private static final Z FIFTY_SIX = Z.valueOf(56);

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int tn = 1 << mN;
    final int tm = 1 << (mN - 1);
    return Z.ONE.shiftLeft(3 * tn)
      .add(TWENTY_TWO.shiftLeft(tn + tm + mN))
      .subtract(TWENTY_TWO.shiftLeft(tn + tm))
      .add(TWENTY_ONE.shiftLeft(2 * tn))
      .add(FORTY_TWO.shiftLeft(tn + mN))
      .add(FIFTY_SIX.shiftLeft(tn))
      .add(FIFTY_SIX.shiftLeft(tm + mN))
      .subtract(FIFTY_SIX.shiftLeft(tm))
      .add(FORTY_EIGHT.shiftLeft(mN))
      .shiftRight(mN).divide(168);
  }
}
