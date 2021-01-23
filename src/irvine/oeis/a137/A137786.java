package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137786 4^n - 3^n - 2^n.
 * @author Sean A. Irvine
 */
public class A137786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137786() {
    super(new long[] {24, -26, 9}, new long[] {-1, -1, 3});
  }
}
