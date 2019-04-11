package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022974 <code>18-n</code>.
 * @author Sean A. Irvine
 */
public class A022974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022974() {
    super(new long[] {-1, 2}, new long[] {18, 17});
  }
}
