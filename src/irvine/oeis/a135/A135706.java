package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135706.
 * @author Sean A. Irvine
 */
public class A135706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135706() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 14});
  }
}
