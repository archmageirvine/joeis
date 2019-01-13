package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185452.
 * @author Sean A. Irvine
 */
public class A185452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185452() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 3, 1, 8});
  }
}
