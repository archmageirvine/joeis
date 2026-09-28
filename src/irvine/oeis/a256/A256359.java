package irvine.oeis.a256;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A256359 Numbers n such that there is at least one base b in which n is a multiple-digit narcissistic number.
 * @author Sean A. Irvine
 */
public class A256359 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A256359() {
    super(1, 5, n -> {
      for (long base = 2; base < n; ++base) {
        final LinkedList<Long> l = new LinkedList<>();
        long y = n;
        long j = 0;
        while (y != 0) {
          final long x = y % base;
          ++j;
          l.add(x);
          while (y % base != 0) {
            --y;
          }
          y /= base;
        }
        Z t = Z.ZERO;
        for (final long p : l) {
          t = t.add(Z.valueOf(p).pow(j));
        }
        if (t.equals(n)) {
          return true;
        }
      }
      return false;
    });
  }
}
