package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172416.
 * @author Sean A. Irvine
 */
public class A172416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172416() {
    super(new long[] {-2, -1, 3, 1}, new long[] {1, 1, 3, 4});
  }
}
