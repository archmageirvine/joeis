package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007009.
 * @author Sean A. Irvine
 */
public class A007009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007009() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {1, 4, 12, 27, 54, 96, 160});
  }
}

