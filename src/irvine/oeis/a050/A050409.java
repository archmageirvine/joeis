package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050409 Truncated square pyramid numbers: a(n) = Sum_{k = n..2*n} k^2.
 * @author Sean A. Irvine
 */
public class A050409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050409() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 29, 86});
  }
}
