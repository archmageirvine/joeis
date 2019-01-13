package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221367.
 * @author Sean A. Irvine
 */
public class A221367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221367() {
    super(new long[] {1, 0, -10, 0, 10, 0}, new long[] {1, 7, 1, 77, 1, 700});
  }
}
