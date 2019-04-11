package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062741 3 times pentagonal numbers: <code>3*n*(3*n-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A062741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062741() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 15});
  }
}
