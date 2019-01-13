package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014943.
 * @author Sean A. Irvine
 */
public class A014943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014943() {
    super(new long[] {625, -675, 51}, new long[] {1, 51, 1926});
  }
}
