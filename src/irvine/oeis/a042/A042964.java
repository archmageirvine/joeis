package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042964.
 * @author Sean A. Irvine
 */
public class A042964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042964() {
    super(new long[] {-1, 1, 1}, new long[] {2, 3, 6});
  }
}
