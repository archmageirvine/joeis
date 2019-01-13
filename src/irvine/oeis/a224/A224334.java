package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224334.
 * @author Sean A. Irvine
 */
public class A224334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224334() {
    super(new long[] {1, -3, 3}, new long[] {21, 51, 93});
  }
}
