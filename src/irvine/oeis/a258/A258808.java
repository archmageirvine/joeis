package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258808 a(n) = n^7 - 1.
 * @author Sean A. Irvine
 */
public class A258808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258808() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 127, 2186, 16383, 78124, 279935, 823542, 2097151});
  }
}
