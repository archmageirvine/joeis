package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033570.
 * @author Sean A. Irvine
 */
public class A033570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033570() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 35});
  }
}
