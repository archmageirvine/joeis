package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212250.
 * @author Sean A. Irvine
 */
public class A212250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212250() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 0, 4, 18, 54, 129, 262});
  }
}
