package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055143 The first n digits of the juxtaposition of the base-2 numbers converted to decimal.
 * @author Georg Fischer
 */
public class A055143 extends Sequence1 {

  private int mN;
  private int mBase;
  private StringBuilder mStr; // the concatenation
  private int mS; // the number to be appended

  /** Construct the sequence. */
  public A055143() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param base number base
   */
  public A055143(final int base) {
    mBase = base;
    mN = 0;
    mStr = new StringBuilder();
    mS = 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN >= mStr.length()) {
      ++mS;
      mStr.append(Z.valueOf(mS).toString(mBase));
    }
    return new Z(mStr.substring(0, mN), mBase);
  }
}
