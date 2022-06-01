package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212697 a(n) = 2*n*3^(n-1).
 * @author Sean A. Irvine
 */
public class A212697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212697() {
    super(new long[] {-9, 6}, new long[] {2, 12});
  }
}
