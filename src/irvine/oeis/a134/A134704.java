package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134704.
 * @author Sean A. Irvine
 */
public class A134704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134704() {
    super(new long[] {-4, -5, 4, 3, 0}, new long[] {3, 3, 10, 9, 17});
  }
}
