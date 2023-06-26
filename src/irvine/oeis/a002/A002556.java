package irvine.oeis.a002;

import java.util.Arrays;

import irvine.oeis.FiniteSequence;

/**
 * A002556 Odd squarefree numbers with an odd number of prime factors that have no prime factors greater than 31.
 * @author Sean A. Irvine
 */
public class A002556 extends FiniteSequence {

  private static final long[] PRIMES = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

  private static long[] buildList() {
    final long[] res = new long[512];
    for (int k = 0, l = 0; k < res.length; ++k) {
      do {
        ++l;
      } while ((Integer.bitCount(l) & 1) == 0);
      long p = 1;
      for (int j = l, i = 0; j != 0; j >>= 1, ++i) {
        if ((j & 1) == 1) {
          p *= PRIMES[i];
        }
      }
      res[k] = p;
    }
    Arrays.sort(res);
    return res;
  }

  /** Construct the sequence. */
  public A002556() {
    super(1, FINITE, buildList());
  }

}
