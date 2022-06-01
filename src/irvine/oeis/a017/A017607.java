package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017607 (12n+7)^3.
 * @author Sean A. Irvine
 */
public class A017607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017607() {
    super(new long[] {-1, 4, -6, 4}, new long[] {343, 6859, 29791, 79507});
  }
}
