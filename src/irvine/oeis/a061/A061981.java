package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061981.
 * @author Sean A. Irvine
 */
public class A061981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061981() {
    super(new long[] {3, -7, 5}, new long[] {0, 0, 4});
  }
}
