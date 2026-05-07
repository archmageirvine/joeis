package irvine.oeis.a395;

import irvine.oeis.FilterNumberSequence;

/**
 * A395504 allocated for Srikanth Cherukupally.
 * @author Sean A. Irvine
 */
public class A395504 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395504() {
    super(1, m -> {
      int cnt = 0;
      final long m2 = m * m - 1;
      for (long k = 1; k < m; ++k) {
        if (m2 % k == 0 && (k * k - 1) % m == 0 && ++cnt > 2) {
          return true;
        }
      }
      return false;
    });
  }
}
