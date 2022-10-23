package irvine.oeis.a094;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A094501 Smallest number that requires n iterations of the sum of digits of the divisors (A034690) to reach 15.
 * @author Sean A. Irvine
 */
public class A094501 extends Sequence0 {

  // Apart from the first iteration the following should be way large
  // enough for most cases.
  private final long[] mCache = new long[100000];
  {
    for (int k = 1; k < mCache.length; ++k) {
      long sum = 0;
      for (final Z t : Jaguar.factor(k).divisors()) {
        sum += ZUtils.digitSum(t);
      }
      mCache[k] = sum;
    }
  }

  private long divisorDigitSum(final long m) {
    if (m < mCache.length) {
      return mCache[(int) m];
    }
    long sum = 0;
    for (final Z t : Jaguar.factor(m).divisors()) {
      sum += ZUtils.digitSum(t);
    }
    return sum;
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    long s = 2;
    while (true) {
      long m = s;
      int k = 0;
      while (m != 15 && k < mN) {
        m = divisorDigitSum(m);
        ++k;
      }
      if (k == mN && m == 15) {
        return Z.valueOf(s);
      }
      ++s;
    }
  }

  /**
   * Print the trajectory for a specific number.
   *
   * @param args number to print trajectory of
   */
  public static void main(final String[] args) {
    if (args == null || args.length == 0) {
      System.err.println("Usage: A094501 n");
      return;
    }
    final A094501 seq = new A094501();
    long v = Long.parseLong(args[0]);
    while (v != 15) {
      System.out.println(v);
      v = seq.divisorDigitSum(v);
    }
  }
}

