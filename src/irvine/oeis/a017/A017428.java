package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017428 (11n+3)^4.
 * @author Sean A. Irvine
 */
public class A017428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017428() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 38416, 390625, 1679616, 4879681});
  }
}
