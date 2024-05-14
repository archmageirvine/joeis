package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069675 Primes all of whose internal digits (if any) are 0.
 * @author Sean A. Irvine
 */
public class A069675 extends Sequence1 {

  private static final Z[] SMALL = {Z.TWO, Z.THREE, Z.FIVE, Z.SEVEN};
  private static final int[] LAST = {1, 3, 7, 9};
  private final long mInternal;
  private Z mT = Z.TEN;
  private Z mC = Z.ZERO;
  private long mA = 1;
  private int mB = -1;
  private int mN = 0;

  protected A069675(final long internalDigit) {
    mInternal = internalDigit;
  }

  /** Construct the sequence. */
  public A069675() {
    this(0);
  }

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return SMALL[mN++];
    }
    while (true) {
      if (++mB >= LAST.length) {
        if (++mA > 9) {
          mT = mT.multiply(10);
          mC = mC.add(mInternal).multiply(10);
          mA = 1;
        }
        mB = 0;
      }
      final Z t = mT.multiply(mA).add(mC).add(LAST[mB]);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
