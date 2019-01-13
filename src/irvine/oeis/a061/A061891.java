package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061891.
 * @author Sean A. Irvine
 */
public class A061891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061891() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, 4, 7});
  }
}
