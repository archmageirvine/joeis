package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153875.
 * @author Sean A. Irvine
 */
public class A153875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153875() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 39});
  }
}
