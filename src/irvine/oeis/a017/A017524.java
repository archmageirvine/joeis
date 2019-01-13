package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017524.
 * @author Sean A. Irvine
 */
public class A017524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017524() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 20736, 331776, 1679616, 5308416});
  }
}
