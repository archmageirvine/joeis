package irvine.oeis.a147;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A147963 a(n) = number of n-digit numbers not divisible by any of their digits.
 * @author Sean A. Irvine
 */
public class A147963 implements Sequence {

  private long mLimit = 1;

  private boolean test(final long n) {
    long m = n;
    while (m != 0) {
      final long t = m % 10;
      if (t != 0 && n % t == 0) {
        return false;
      }
      m /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    // This bizarre sequence ignores numbers ending in 0
    long start = 2 * mLimit; // All the numbers starting with 1 can be excluded
    mLimit *= 10;
    long c = 0;
    while (start < mLimit) {
      start += 3; // skip 0, 1, 2
      if (test(start)) {
        ++c;
      }
      if (test(++start)) {
        ++c;
      }
      start += 2; // skip 5
      if (test(start)) {
        ++c;
      }
      if (test(++start)) {
        ++c;
      }
      if (test(++start)) {
        ++c;
      }
      if (test(++start)) {
        ++c;
      }
      ++start;
    }
    return Z.valueOf(c);
  }
}

