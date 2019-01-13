package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158364.
 * @author Sean A. Irvine
 */
public class A158364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158364() {
    super(new long[] {1, -3, 3}, new long[] {527, 2112, 4755});
  }
}
