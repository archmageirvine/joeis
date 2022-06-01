package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081666 n*3^(n-1)+A081567(n).
 * @author Sean A. Irvine
 */
public class A081666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081666() {
    super(new long[] {-45, 75, -44, 11}, new long[] {1, 4, 16, 62});
  }
}
