package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177964.
 * @author Sean A. Irvine
 */
public class A177964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177964() {
    super(new long[] {-1, 1, 1}, new long[] {2, 13, 17});
  }
}
