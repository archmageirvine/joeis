package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213755.
 * @author Sean A. Irvine
 */
public class A213755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213755() {
    super(new long[] {-4, 20, -41, 44, -26, 8}, new long[] {1, 9, 44, 160, 491, 1355});
  }
}
