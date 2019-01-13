package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124011.
 * @author Sean A. Irvine
 */
public class A124011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124011() {
    super(new long[] {1, -3, 3}, new long[] {5, 8, 14});
  }
}
