package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022980 24-n.
 * @author Sean A. Irvine
 */
public class A022980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022980() {
    super(new long[] {-1, 2}, new long[] {24, 23});
  }
}
