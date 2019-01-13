package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120573.
 * @author Sean A. Irvine
 */
public class A120573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120573() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {6, 60, 330, 1224, 3510, 8436});
  }
}
