package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098586.
 * @author Sean A. Irvine
 */
public class A098586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098586() {
    super(new long[] {-1, -1, 3}, new long[] {2, 5, 13});
  }
}
