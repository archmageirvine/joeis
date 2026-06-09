package irvine.oeis.a085;

import irvine.oeis.FilterNumberSequence;

/**
 * A085251 Numbers that are the sum of the squares of some substring decomposition of themselves.
 * @author Sean A. Irvine
 */
public class A085251 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085251() {
    super(1, 0, A085251::is);
  }

  private static boolean is(final long n, final String ns, final long sum, final int pos) {
    if (pos >= ns.length()) {
      return n == sum;
    }
    for (int end = pos + 1; end <= ns.length(); ++end) {
      final long v = Long.parseLong(ns.substring(pos, end));
      final long s = sum + v * v;
      if (s > n) {
        break;
      }
      if (is(n, ns, s, end)) {
        return true;
      }
    }
    return false;
  }

  private static boolean is(final long k) {
    return is(k, String.valueOf(k), 0, 0);
  }
}
