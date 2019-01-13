package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138003.
 * @author Sean A. Irvine
 */
public class A138003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138003() {
    super(new long[] {-1, 2, -4, 3}, new long[] {1, 2, 3, 3});
  }
}
