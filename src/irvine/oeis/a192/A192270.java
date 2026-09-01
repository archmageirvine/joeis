package irvine.oeis.a192;

import java.util.List;

import irvine.factor.util.FactorUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A192270 Pseudo-antiperfect numbers.
 * @author Sean A. Irvine
 */
public class A192270 extends FilterNumberSequence {

  private static boolean search(final long n, final List<Long> d, final int pos) {
    if (n == 0) {
      return true;
    }
    for (int k = pos; k < d.size(); ++k) {
      final long v = d.get(k);
      if (v <= n && search(n - v, d, k + 1)) {
        return true;
      }
    }
    return false;
  }

  /** Construct the sequence. */
  public A192270() {
    super(1, k -> {
      final List<Long> a = FactorUtils.antidivisors(k);
      if (a.size() >= Long.SIZE) {
        throw new UnsupportedOperationException();
      }
      return search(k, a, 0);
    });
  }
}
