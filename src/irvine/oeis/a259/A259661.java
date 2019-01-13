package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259661.
 * @author Sean A. Irvine
 */
public class A259661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259661() {
    super(new long[] {-10, 11, -11, 11}, new long[] {1, 11, 110, 1100});
  }
}
