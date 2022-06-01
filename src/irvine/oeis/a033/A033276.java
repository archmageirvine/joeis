package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033276 Number of diagonal dissections of an n-gon into 4 regions.
 * @author Sean A. Irvine
 */
public class A033276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033276() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 14, 84, 300, 825, 1925, 4004});
  }
}
