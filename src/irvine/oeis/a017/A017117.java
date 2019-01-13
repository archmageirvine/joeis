package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017117.
 * @author Sean A. Irvine
 */
public class A017117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017117() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1024, 248832, 3200000, 17210368, 60466176, 164916224});
  }
}
