package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272133 a(n) = 122880*n^5 - 829440*n^4 + 2258688*n^3 - 3076288*n^2 + 2079892*n - 555731.
 * @author Sean A. Irvine
 */
public class A272133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272133() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {-555731, 1, 29525, 1657129, 16591741, 80872529});
  }
}
