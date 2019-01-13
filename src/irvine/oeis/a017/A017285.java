package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017285.
 * @author Sean A. Irvine
 */
public class A017285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017285() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 161051, 4084101, 28629151, 115856201, 345025251});
  }
}
