package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124011 Add three, add six, add nine, ....
 * @author Sean A. Irvine
 */
public class A124011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124011() {
    super(1, new long[] {1, -3, 3}, new long[] {5, 8, 14});
  }
}
