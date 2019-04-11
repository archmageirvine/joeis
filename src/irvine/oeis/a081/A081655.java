package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081655 <code>2*5^n-1</code>.
 * @author Sean A. Irvine
 */
public class A081655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081655() {
    super(new long[] {-5, 6}, new long[] {1, 9});
  }
}
