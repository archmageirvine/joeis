package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135056.
 * @author Sean A. Irvine
 */
public class A135056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135056() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {0, 1, 2, 3, 4});
  }
}
