package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020448.
 * @author Sean A. Irvine
 */
public class A020448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020448() {
    super(new long[] {480, -196, 25}, new long[] {1, 25, 429});
  }
}
