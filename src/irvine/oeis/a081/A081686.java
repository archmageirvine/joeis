package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081686.
 * @author Sean A. Irvine
 */
public class A081686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081686() {
    super(new long[] {2520, -2754, 1175, -245, 25}, new long[] {1, 1, -1, 19, 467});
  }
}
