package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135447.
 * @author Sean A. Irvine
 */
public class A135447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135447() {
    super(new long[] {-1, 1, -1, 1}, new long[] {1, 2, 4, 8});
  }
}
