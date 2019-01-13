package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185964.
 * @author Sean A. Irvine
 */
public class A185964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185964() {
    super(new long[] {1, -2, 0, 1}, new long[] {1, -1, 0, -2});
  }
}
