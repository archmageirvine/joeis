package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060011 Schizophrenic sequence: these are the repeating digits in the decimal expansion of sqrt(f(2n+1)), where f(m) = A014824(m).
 * @author Sean A. Irvine
 */
public class A060011 implements Sequence {

  // After K. S. Brown
  // See https://www.mathpages.com/home/kmath404.htm

  private static final long[] RECIP = {0, 1, 5, 0, 7, 2, 0, 4, 8};
  private int mN = -1;
  private long mF = 5;
  private long mSum3 = 0;
  private long mD = -2;

  @Override
  public Z next() {
    // A couple of special cases at the start
    if (mD == -2) {
      ++mD;
      return Z.ONE;
    } else if (mD == -1) {
      mD = 5;
      return Z.FIVE;
    }
    // General iteration
    mN += 2;
    long n = mN;
    long d = mN + 3;
    while (n % 3 == 0) {
      n /= 3;
      ++mSum3;
    }
    while (d % 3 == 0) {
      d /= 3;
      --mSum3;
    }
    n %= 9;
    d %= 9;
    mF = (mF * n * RECIP[(int) d]) % 9;
    final long a;
    if (mSum3 == 0) {
      a = mF;
    } else if (mSum3 == 1) {
      a = (mF * 3) % 9;
    } else {
      a = 0;
    }
    mD = (9 + mD - a) % 9;
    if (mD == 0) {
      mD = 9;
    }
    return Z.valueOf(mD);
  }
}
