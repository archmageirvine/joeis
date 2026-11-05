package irvine.math.function;

import irvine.math.z.Z;

/**
 * Floor of log2(n): number of bits - 1.
 * @author Georg Fischer
 */
class FloorLog2 extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    if (n.compareTo(Z.ZERO) <= 0) {
      return Z.NEG_ONE;
    }
    return Z.valueOf(n.bitLength()).subtract(1);
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
    return Functions.DIGIT_LENGTH.l(2, n) - 1L;
  }

  @Override
  public int i(final long n) {
    if (n <= 0L) {
      return -1;
    }
    return Functions.DIGIT_LENGTH.i(2, n) - 1;
  }

  @Override
  public int i(final int n) {
    if (n <= 0) {
      return -1;
    }
    return Functions.DIGIT_LENGTH.i(2, n) - 1;
  }

}
