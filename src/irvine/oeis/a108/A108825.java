package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A108825.
 * @author Sean A. Irvine
 */
public class A108825 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  // Approx 10MB table of precomputed digit sums
  private static final int CHUNK = 1000000;
  private static final Z Z_CHUNK = Z.valueOf(CHUNK);
  private static final byte[] DIGIT_SUM = new byte[CHUNK];
  static {
    for (int k = 0; k < CHUNK; ++k) {
      DIGIT_SUM[k] = (byte) ((k % 10) + DIGIT_SUM[k / 10]);
    }
  }

  private long digitSum(Z n) {
    long c = 0;
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(Z_CHUNK);
      c += DIGIT_SUM[qr[1].intValue()];
      n = qr[0];
    }
    return c;
  }

  @Override
  public Z next() {
    while (true) {
      long n = ++mN;
      // Some trickery to remove multiples of 10 (i.e. 0's) in the factorial.
      while (n % 10 == 0) {
        n /= 10;
      }
      while (n % 5 == 0) {
        n /= 5;
        mF = mF.divide2();
      }
      mF = mF.multiply(n);
      assert mF.mod(10) != 0;
      if (digitSum(mF) % mN == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

