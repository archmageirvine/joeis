package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122501.
 * @author Sean A. Irvine
 */
public class A122501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122501() {
    super(new long[] {38, 54, 22, 0}, new long[] {1, 5, 47, 211});
  }
}
