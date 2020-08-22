package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000855 Final two digits of 2^n.
 * @author Sean A. Irvine
 */
public class A000855 implements Sequence {

  private static final Z[] SEQ = {
    Z.FOUR,
    Z.EIGHT,
    Z.valueOf(16),
    Z.valueOf(32),
    Z.valueOf(64),
    Z.valueOf(28),
    Z.valueOf(56),
    Z.valueOf(12),
    Z.valueOf(24),
    Z.valueOf(48),
    Z.valueOf(96),
    Z.valueOf(92),
    Z.valueOf(84),
    Z.valueOf(68),
    Z.valueOf(36),
    Z.valueOf(72),
    Z.valueOf(44),
    Z.valueOf(88),
    Z.valueOf(76),
    Z.valueOf(52),
  };

  private int mN = -3;

  @Override
  public Z next() {
    if (++mN < 0) {
      if (mN == -2) {
        return Z.ONE;
      } else {
        return Z.TWO;
      }
    }
    mN %= SEQ.length;
    return SEQ[mN];
  }
}
