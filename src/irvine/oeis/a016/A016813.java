package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016813 a(n) = 4*n + 1.
 * @author Sean A. Irvine
 */
public class A016813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016813() {
    super(new long[] {-1, 2}, new long[] {1, 5});
  }
}
