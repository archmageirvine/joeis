package irvine.oeis.a087;

import irvine.oeis.FilterNumberSequence;

/**
 * A087086 Primitive sets of integers, each subset mapped onto a unique binary integer, values here shown in decimal.
 * @author Sean A. Irvine
 */
public class A087086 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087086() {
    super(0, 0, n -> {
      if (n < 3) {
        return true;
      }
      if ((n & 1) == 1) {
        return false;
      }
      final long lim = Long.highestOneBit(n);
      for (long k = 2, j = 2; j < lim; ++k, j <<= 1) {
        if ((n & j) != 0) {
          for (long i = 2 * k, h; (h = 1L << (i - 1)) <= lim; i += k) {
            if ((n & h) != 0) {
              return false;
            }
          }
        }
      }
      return true;
    });
  }
}

