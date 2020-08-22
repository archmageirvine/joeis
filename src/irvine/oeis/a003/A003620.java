package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003620 Number of iterations until 3n reaches 153 under x goes to sum of cubes of digits map.
 * @author Sean A. Irvine
 */
public class A003620 implements Sequence {

  private static final long[] DIGIT_CUBES = {0, 1, 8, 27, 64, 125, 216, 343, 512, 729};
  private long mN = 0;

  private long digitCubeSum(long n) {
    long s = 0;
    while (n != 0) {
      s += DIGIT_CUBES[(int) (n % 10)];
      n /= 10;
    }
    return s;
  }

  @Override
  public Z next() {
    mN += 3;
    long count = 0;
    long m = mN;
    while (m != 153) {
      m = digitCubeSum(m);
      ++count;
    }
    return Z.valueOf(count);
  }
}
