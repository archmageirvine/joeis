package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006055 Primes with consecutive (ascending) digits.
 * @author Sean A. Irvine
 */
public class A006055 extends Sequence1 {

  private int mLength = 0;
  private int mDigit = 9;

  private Z build(final int length, final int firstDigit) {
    Z n = Z.ZERO;
    for (int k = 0, d = firstDigit; k < length; ++k, ++d, d %= 10) {
      n = n.multiply(10).add(d);
    }
    return n;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mDigit == 10) {
        ++mLength;
        mDigit = 1;
      }
      final Z n = build(mLength, mDigit);
      if (n.isProbablePrime()) {
        return n;
      }
    }
  }
}

