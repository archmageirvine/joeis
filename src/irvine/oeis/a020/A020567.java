package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020567.
 * @author Sean A. Irvine
 */
public class A020567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020567() {
    super(new long[] {550, -215, 26}, new long[] {1, 26, 461});
  }
}
