package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265888.
 * @author Sean A. Irvine
 */
public class A265888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265888() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 1, 2, 3, 5, 4});
  }
}
