package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022988 <code>32-n</code>.
 * @author Sean A. Irvine
 */
public class A022988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022988() {
    super(new long[] {-1, 2}, new long[] {32, 31});
  }
}
