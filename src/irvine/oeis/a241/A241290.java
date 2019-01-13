package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241290.
 * @author Sean A. Irvine
 */
public class A241290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241290() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 9, 0, 9, 7});
  }
}
