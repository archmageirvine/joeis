package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000327.
 * @author Sean A. Irvine
 */
public class A000327 implements Sequence {

  // Method due to R. J. Mathar

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    final int limit = (int) Math.floor(Math.pow(mN, 1.5));
    Z a = Z.ZERO;
    for (int x1 = 1; x1 <= limit; ++x1) {
      final double x2 = Math.pow(mN - Math.pow(x1, 2.0 / 3.0), 1.5);
      if (Math.floor(x2) >= x1 + 1) {
        a = a.add((long) Math.floor(x2 - x1));
      }
    }
    return a;
  }
}

