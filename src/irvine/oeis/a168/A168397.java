package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168397 a(n) = 8 * floor(n/2).
 * @author Sean A. Irvine
 */
public class A168397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168397() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 8, 8});
  }
}
