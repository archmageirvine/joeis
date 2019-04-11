package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022266 <code>a(n) = n*(9*n - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A022266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022266() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 17});
  }
}
