package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020577.
 * @author Sean A. Irvine
 */
public class A020577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020577() {
    super(new long[] {504, -198, 25}, new long[] {1, 25, 427});
  }
}
