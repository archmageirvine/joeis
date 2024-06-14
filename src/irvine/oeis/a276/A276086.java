package irvine.oeis.a276;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A276086 Primorial base exp-function: digits in primorial base representation of n become the exponents of successive prime factors whose product a(n) is.
 * @author Georg Fischer
 */
public class A276086 extends AbstractSequence implements DirectSequence {

  private int mN;
  //                                   ip = 0   1   2    3     4
  private long[] mPrimes = new long[] {2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 41L};
  private long[] mPrimorials = new long[] {1L, 2L, 6L, 30L, 210L, 2310L, 30030L, 510510L, 9699690L, 223092870L, 6469693230L, 200560490130L, 7420738134810L}; // primorial base cannot unambigously represent n &gt;= 2100 = 10*7*5*3*2

  /** Construct the sequence. */
  public A276086() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z n) {
    if (n.bitLength() >= 60) {
      throw new UnsupportedOperationException("Ambiguous primorial base representation");
    }
    return a(n.intValueExact());
  }

  @Override
  public Z a(int n) {
    if (n <= 2) {
      return Z.valueOf(n + 1);
    }
    if (n >= 7420738134810L) {
      throw new UnsupportedOperationException("Ambiguous primorial base representation");
    }
    Z result = Z.ONE;
    int ip = mPrimorials.length;
    while (n > 0) {
      final long pm = mPrimorials[--ip];
      long digit = n / pm;
      n -= pm * digit;
      // System.out.println("ip=" + ip + ", n=" + n + ", pm=" + pm + ", digit=" + digit + ", mPrimes[" + ip + "]=" + mPrimes[ip] + ", result=" + result);
      if (digit != 0) {
        result = result.multiply(Z.valueOf(mPrimes[ip]).pow(digit));
      }
    }
    return result;
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
