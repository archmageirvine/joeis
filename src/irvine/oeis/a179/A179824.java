package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179824.
 * @author Sean A. Irvine
 */
public class A179824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179824() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 24, 108, 320, 750});
  }
}
