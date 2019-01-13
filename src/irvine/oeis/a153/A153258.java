package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153258.
 * @author Sean A. Irvine
 */
public class A153258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153258() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-4, -8, -8, 2});
  }
}
