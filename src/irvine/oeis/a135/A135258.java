package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135258 Inverse binomial transform of A131666 after removing A131666(0) <code>= 0</code>.
 * @author Sean A. Irvine
 */
public class A135258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135258() {
    super(new long[] {2, 1, 0, -2}, new long[] {0, 1, -1, 2});
  }
}
