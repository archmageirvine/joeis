package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083445.
 * @author Sean A. Irvine
 */
public class A083445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083445() {
    super(new long[] {90, -109, 20}, new long[] {18, 270, 3438});
  }
}
