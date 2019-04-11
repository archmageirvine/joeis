package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158312 <code>400n^2 + 2n</code>.
 * @author Sean A. Irvine
 */
public class A158312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158312() {
    super(new long[] {1, -3, 3}, new long[] {402, 1604, 3606});
  }
}
