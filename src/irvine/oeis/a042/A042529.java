package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042529.
 * @author Sean A. Irvine
 */
public class A042529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042529() {
    super(new long[] {-1, 0, 0, 0, 8786, 0, 0, 0}, new long[] {1, 6, 25, 156, 8761, 52722, 219649, 1370616});
  }
}
