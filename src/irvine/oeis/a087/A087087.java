package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A087087 Coprime sets of integers, each subset mapped onto a unique binary integer, values here shown in decimal.
 * @author Sean A. Irvine
 */
public class A087087 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087087() {
    super(0, 0, n -> {
      if (n < 10) {
        return true;
      }
      final long lim = Long.highestOneBit(n);
      for (long k = 2, j = 2; j < lim; ++k, j <<= 1) {
        if ((n & j) != 0) {
          for (long i = k + 1, h = 1L << k; h <= lim; ++i, h <<= 1) {
            if ((n & h) != 0 && Functions.GCD.i(k, i) != 1) {
              return false;
            }
          }
        }
      }
      return true;
    });
  }
}

