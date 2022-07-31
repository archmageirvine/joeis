package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058231 A Somos-8 sequence.
 * @author Sean A. Irvine
 */
public class A058231 implements Sequence {

  private static final long[] U = {314101616640L, 25442230947840L, 235226865664L, -181502208, -16L};
  private static final Z[] INIT = {
    Z.ZERO,
    Z.ZERO,
    Z.ONE,
    Z.valueOf(36),
    Z.valueOf(-16),
    Z.valueOf(5041728),
    Z.valueOf(-19631351040L),
    Z.valueOf(-62024429150208L),
    Z.valueOf(-2805793044443561984L),
    new Z("-1213280369793911777918976")
  };
  private final Z[] mA = new Z[10];

  @Override
  public Z next() {
    if (mA[9] == null) {
      int k = 9;
      while (k > 0 && mA[k - 1] == null) {
        --k;
      }
      mA[k] = INIT[k];
      return INIT[k];
    }
    final Z t = mA[6].square().multiply(U[0])
      .add(mA[5].multiply(mA[7]).multiply(U[1]))
      .add(mA[4].multiply(mA[8]).multiply(U[2]))
      .add(mA[3].multiply(mA[9]).multiply(U[3]))
      .divide(U[4])
      .divide(mA[2])
      .negate();
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[9] = t;
    return t;
  }
}
