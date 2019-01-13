package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037770.
 * @author Sean A. Irvine
 */
public class A037770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037770() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {3, 27, 245, 2206, 19857});
  }
}
