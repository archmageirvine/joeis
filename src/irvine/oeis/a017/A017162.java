package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017162.
 * @author Sean A. Irvine
 */
public class A017162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017162() {
    super(new long[] {1, -3, 3}, new long[] {0, 81, 324});
  }
}
