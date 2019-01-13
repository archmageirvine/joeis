package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132607.
 * @author Sean A. Irvine
 */
public class A132607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132607() {
    super(new long[] {1, -399, 399}, new long[] {0, 99, 39600});
  }
}
