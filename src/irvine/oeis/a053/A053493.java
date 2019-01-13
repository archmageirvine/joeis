package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053493.
 * @author Sean A. Irvine
 */
public class A053493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053493() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {1, 10, 56, 214, 641, 1620, 3616, 7340});
  }
}
