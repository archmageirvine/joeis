package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158444 <code>16n^2 + 4</code>.
 * @author Sean A. Irvine
 */
public class A158444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158444() {
    super(new long[] {1, -3, 3}, new long[] {20, 68, 148});
  }
}
