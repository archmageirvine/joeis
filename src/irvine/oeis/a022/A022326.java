package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022326.
 * @author Sean A. Irvine
 */
public class A022326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022326() {
    super(new long[] {-1, 0, 2}, new long[] {1, 12, 14});
  }
}
