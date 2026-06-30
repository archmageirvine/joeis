package irvine.oeis.a106;

import irvine.oeis.FilterNumberSequence;

/**
 * A106039 Belgian-0 numbers.
 * @author Sean A. Irvine
 */
public class A106039 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A106039() {
    super(1, 0, t -> {
      if (t <= 13) {
        return true;
      }
      final char[] d = String.valueOf(Math.max(t, 1)).toCharArray();
      for (int i = 0; i < d.length; ++i) {
        d[i] -= '0';
      }
      for (int i = 1; i < d.length; ++i) {
        d[i] += d[i - 1];
      }
      final long s = d[d.length - 1];
      if (s == 0) {
        return false;
      }
      d[d.length - 1] = 0;
      final long r = t % s;
      for (final int v : d) {
        if (v == r) {
          return true;
        }
      }
      return false;
    });
  }
}
