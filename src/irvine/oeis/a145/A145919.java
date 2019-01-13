package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145919.
 * @author Sean A. Irvine
 */
public class A145919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145919() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {0, 0, 0, 0, 1, 2, -3, 5, 7});
  }
}
