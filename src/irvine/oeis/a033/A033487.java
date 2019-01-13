package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033487.
 * @author Sean A. Irvine
 */
public class A033487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033487() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 30, 90, 210});
  }
}
