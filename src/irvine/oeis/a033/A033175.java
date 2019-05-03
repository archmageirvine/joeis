package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033175 <code>n 3</code>'s followed by 1.
 * @author Sean A. Irvine
 */
public class A033175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033175() {
    super(new long[] {-10, 11}, new long[] {1, 31});
  }
}
