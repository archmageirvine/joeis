package irvine.math.function;

import irvine.math.z.Z;

/**
 * Ceiling of log2(n): number of bits, +1 if no power of 2
 * @author Georg Fischer
 */
class CeilingLog2 extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    if (n.compareTo(Z.ZERO) <= 0) {
      return Z.NEG_ONE;
    }
    return Z.valueOf(n.bitCount() == 1 ? n.bitLength() - 1 : n.bitLength());
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(l(n));
  }

  @Override
  public long l(final long n) {
    if (n <= 0L) {
      return -1L;
    }
    return Long.bitCount(n) == 1 ? Functions.DIGIT_LENGTH.l(2, n) - 1L : Functions.DIGIT_LENGTH.l(2, n);
  }

  @Override
  public int i(final long n) {
    if (n <= 0L) {
      return -1;
    }
    return Long.bitCount(n) == 1 ? Functions.DIGIT_LENGTH.i(2, n) - 1 : Functions.DIGIT_LENGTH.i(2, n);
  }

  @Override
  public int i(final int n) {
    if (n <= 0) {
      return -1;
    }
    return Integer.bitCount(n) == 1 ? Functions.DIGIT_LENGTH.i(2, n) - 1 : Functions.DIGIT_LENGTH.i(2, n);
  }

}
