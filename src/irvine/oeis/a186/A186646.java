package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186646.
 * @author Sean A. Irvine
 */
public class A186646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186646() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 2, 3, 2, 5, 6, 7, 4});
  }
}
