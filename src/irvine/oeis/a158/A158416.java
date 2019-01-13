package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158416.
 * @author Sean A. Irvine
 */
public class A158416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158416() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 2, 1});
  }
}
