package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033981 Integers k such that 2^k == 7 (mod k).
 * @author Sean A. Irvine
 */
public class A033981 implements Sequence {

  private Z mExp2; // exponent of 2
  private Z mN = Z.ZERO;

  /** Construct the sequence. */
  public A033981() {
    this(7);
  }

  /**
   * Generic constructor with parameter
   * @param exp2 exponent of 2
   */
  public A033981(final int exp2) {
    mExp2 = Z.valueOf(exp2);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TWO.modPow(mN, mN).equals(mExp2.mod(mN))) {
        return mN;
      }
    }
  }
}

