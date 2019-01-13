package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260160.
 * @author Sean A. Irvine
 */
public class A260160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260160() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 0}, new long[] {0, 0, 0, 0, 1, 0, 1, 0});
  }
}
