package irvine.oeis.a087;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A087395 Primes in which the frequency of every digit is the same and is at least 2.
 * @author Sean A. Irvine
 */
public class A087395 extends FilterSequence {

  /** Construct the sequence. */
  public A087395() {
    super(1, new A000040(), p -> {
      final int[] cnts = ZUtils.digitCounts(p);
      int c = 0;
      for (final int v : cnts) {
        if (v == 1) {
          return false;
        }
        if (v != 0) {
          if (c == 0) {
            c = v;
          } else if (c != v) {
            return false;
          }
        }
      }
      return true;
    });
  }
}

