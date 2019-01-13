package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017837.
 * @author Sean A. Irvine
 */
public class A017837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017837() {
    super(new long[] {1, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1});
  }
}
