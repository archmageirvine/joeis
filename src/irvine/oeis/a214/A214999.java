package irvine.oeis.a214;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A214992 Power floor sequence of sqrt(5).
 * @author Georg Fischer
 */
public class A214999 extends Sequence0 {

  private int mN;
  private Z mA; // previous term
  private final CR mC;
  private final int mVariant;

  /** Construct the sequence. */
  /** Construct the sequence. */
  /** Construct the sequence. */
  public A214999() {
    this(1, CR.FIVE.sqrt());
  }

  /**
   * Generic constructor with
   * @param variant: 1=floor, 2=floor-ceiling, 3=ceiling-floor, 4=ceiling
   * @param c constant
   */
  /** Construct the sequence. */
  /** Construct the sequence. */
  public A214999(final int variant, final CR c) {
    mN = -1;
    mVariant = variant;
    mC = c;
    switch (mVariant) {
      case 2:
        mA = mC.floor();
        break;
      case 3:
        mA = mC.ceil();
        break;
      case 4:
        mA = mC.ceil();
        break;
      case 1:
      default:
        mA = mC.floor();
        break;
    }
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mA;
    switch (mVariant) {
      case 2:
        mA = ((mN & 1) == 1) ? CR.valueOf(mA).multiply(mC).floor() : CR.valueOf(mA).multiply(mC).ceil();
        break;
      case 3:
        mA = ((mN & 1) == 1) ? CR.valueOf(mA).multiply(mC).ceil() : CR.valueOf(mA).multiply(mC).floor();
        break;
      case 4:
        mA = CR.valueOf(mA).multiply(mC).ceil();
        break;
      case 1:
      default:
        mA = CR.valueOf(mA).multiply(mC).floor();
        break;
    }
    return result;
  }
}
