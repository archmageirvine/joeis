package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147601 First differences of A132355.
 * @author Sean A. Irvine
 */
public class A147601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147601() {
    super(new long[] {-1, 0, 2, 0}, new long[] {7, 4, 21, 8});
  }
}
