package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271994 The chalcogen sequence (a(n) = A018227(n)-2).
 * @author Sean A. Irvine
 */
public class A271994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271994() {
    super(2, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {8, 16, 34, 52, 84, 116});
  }
}
