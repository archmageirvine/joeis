package irvine.oeis.a238;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A238986 Write the decimal digits of n and take the absolute differences of the digits, repeating until a single digit remains. Then sum all digits of each level of the resulting triangle. If the sum is greater than 9, repeat the entire process until result is between 0 and 9, which is a(n).
 * @author Sean A. Irvine
 */
public class A238986 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private int[] f(final int[] v) {
    final int[] res = new int[v.length - 1];
    for (int k = 0; k < res.length; ++k) {
      res[k] = Math.abs(v[k] - v[k + 1]);
    }
    return res;
  }

  private int[] toVec(final long n) {
    final String s = String.valueOf(n);
    final int[] v = new int[s.length()];
    for (int k = 0; k < v.length; ++k) {
      v[k] = s.charAt(k) - '0';
    }
    return v;
  }

  private long pyramidSum(final long n) {
    long sum = 0;
    int[] v = toVec(n);
    while (v.length > 1) {
      sum += Functions.SUM.l(v);
      v = f(v);
    }
    sum += v[0];
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    long sum = mN;
    while (sum > 9) {
      sum = pyramidSum(sum);
    }
    return Z.valueOf(sum);
  }
}
