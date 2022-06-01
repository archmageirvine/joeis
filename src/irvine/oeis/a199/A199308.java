package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199308 (7*5^n+1)/4.
 * @author Sean A. Irvine
 */
public class A199308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199308() {
    super(new long[] {-5, 6}, new long[] {2, 9});
  }
}
