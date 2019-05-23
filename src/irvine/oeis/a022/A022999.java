package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022999.
 * @author Sean A. Irvine
 */
public class A022999 implements Sequence {

  private long mDelta = 0;

  private boolean isApSimon(final long delta) {
    for (long c = 1; c < (delta + 1) / 2; ++c) { // Guy paper has <= delta / 2, but this leads to division by 0
      final long upper = (long) (c * (2 * delta - c + Math.sqrt(c * (4 * delta + c))) / (2 * (delta - 2 * c)));
      for (long b = delta * c / (delta - 2 * c) + 1; b <= upper; ++b) {
        final Z bmc = Z.valueOf(b - c);
        final Z u = bmc.multiply(Z.valueOf(b + c).square().multiply(delta).subtract(bmc.multiply(b).multiply(c).multiply2()));
        final Z v = bmc.multiply(delta).subtract(Z.valueOf(b).multiply(c).multiply2());
        final Z[] qr = u.divideAndRemainder(v);
        if (Z.ZERO.equals(qr[1])) {
          final Z discriminant = qr[0];
          if (discriminant.testBit(0) == (((b - c) & 1) == 1)) {
            discriminant.sqrt();
            if (discriminant.auxiliary() == 1) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (!isApSimon(++mDelta)) {
        return Z.valueOf(mDelta);
      }
    }
  }
}
