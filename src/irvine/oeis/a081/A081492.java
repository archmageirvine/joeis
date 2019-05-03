package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081492 Sum of terms in n-th row of <code>A081491</code>.
 * @author Sean A. Irvine
 */
public class A081492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081492() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 5, 18, 54, 135});
  }
}
