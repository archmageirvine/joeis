package irvine.math.function;

import irvine.math.z.Z;

/**
 * Number of runs of 1's in a number.
 * @author Sean A. Irvine
 */
class RunsOfOne extends AbstractFunction1 {

  @Override
  public long l(final long n) {
    if (n == 0) {
      return 0;
    }
    long r = 0;
    long m = n;
    while (m != 0) {
      while ((m & 1) == 0) {
        m >>>= 1;
      }
      ++r;
      while ((m & 1) == 1) {
        m >>>= 1;
      }
    }
    return r;
  }

  @Override
  public long l(final Z n) {
    if (n.isZero()) {
      return 0;
    }
    long r = 0;
    int bit = 0;
    while (bit < n.bitLength()) {
      while (!n.testBit(bit)) {
        ++bit;
      }
      ++r;
      while (n.testBit(bit)) {
        ++bit;
      }
    }
    return r;
  }

  @Override
  public Z z(final Z n) {
    return Z.valueOf(l(n));
  }
}
