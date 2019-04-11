package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048499 <code>2^(n-1)*(6*n-10)+6</code>.
 * @author Sean A. Irvine
 */
public class A048499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048499() {
    super(new long[] {4, -8, 5}, new long[] {1, 2, 10});
  }
}
