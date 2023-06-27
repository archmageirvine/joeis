package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016084 a(n+1) = a(n) + its digital root.
 * @author Sean A. Irvine
 */
public class A016084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016084() {
    super(1, new long[] {-1, 2, -1, -1, 2}, new long[] {5, 10, 11, 13, 17});
  }
}
