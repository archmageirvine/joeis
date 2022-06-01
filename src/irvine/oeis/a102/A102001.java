package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102001 A weighted tribonacci, (1,2,4).
 * @author Sean A. Irvine
 */
public class A102001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102001() {
    super(new long[] {4, 2, 1}, new long[] {1, 3, 9});
  }
}
