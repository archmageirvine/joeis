package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A050749 Squares containing no pair of consecutive equal digits.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A050749 extends AbstractSequence {

  private int mN;
  private int mPower;

  /** Construct the sequence. */
  public A050749() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param power exponentiate with this number
   */
  public A050749(final int offset, final int power) {
    super(offset);
    mN = -1;
    mPower = power;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z m = Z.valueOf(++mN).pow(mPower);
      Z t = m;
      Z r = Z.NEG_ONE;
      do {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (qr[1].equals(r)) {
          continue outer;
        }
        r = qr[1];
        t = qr[0];
      } while (!t.isZero());
      return m;
    }
  }
}
