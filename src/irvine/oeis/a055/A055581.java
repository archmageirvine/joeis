package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055581 Fifth column of triangle A055252.
 * @author Sean A. Irvine
 */
public class A055581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055581() {
    super(new long[] {8, -28, 38, -25, 8}, new long[] {1, 8, 39, 150, 501});
  }
}
