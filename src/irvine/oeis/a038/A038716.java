package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038716.
 * @author Sean A. Irvine
 */
public class A038716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038716() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 0, 0, 0, 2, 2, 3});
  }
}
