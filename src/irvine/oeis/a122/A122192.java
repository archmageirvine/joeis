package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122192.
 * @author Sean A. Irvine
 */
public class A122192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122192() {
    super(new long[] {-1, 0, -759, -2576, -759, 0}, new long[] {6, 0, -1518, -7728, 1149126, 9775920});
  }
}
