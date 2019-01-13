package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134165.
 * @author Sean A. Irvine
 */
public class A134165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134165() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 3, 8, 24});
  }
}
