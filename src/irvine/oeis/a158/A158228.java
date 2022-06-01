package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158228 225n^2 + 2n.
 * @author Sean A. Irvine
 */
public class A158228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158228() {
    super(new long[] {1, -3, 3}, new long[] {227, 904, 2031});
  }
}
