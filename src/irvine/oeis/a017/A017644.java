package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017644 (12n+10)^4.
 * @author Sean A. Irvine
 */
public class A017644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017644() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {10000, 234256, 1336336, 4477456, 11316496});
  }
}
