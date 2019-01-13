package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020593.
 * @author Sean A. Irvine
 */
public class A020593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020593() {
    super(new long[] {528, -202, 25}, new long[] {1, 25, 423});
  }
}
