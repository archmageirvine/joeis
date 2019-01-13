package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135432.
 * @author Sean A. Irvine
 */
public class A135432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135432() {
    super(new long[] {-1, 1, 1, 1, 1}, new long[] {0, 1, 2, 3, 4});
  }
}
