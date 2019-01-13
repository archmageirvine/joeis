package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122946.
 * @author Sean A. Irvine
 */
public class A122946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122946() {
    super(new long[] {4, 0, 1}, new long[] {0, 0, 2});
  }
}
