package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085717.
 * @author Sean A. Irvine
 */
public class A085717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085717() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {1, 1, 1, 2, 3, 5, 6});
  }
}
