package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136412 <code>a(n) = (5*4^n+1)/3</code>.
 * @author Sean A. Irvine
 */
public class A136412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136412() {
    super(new long[] {-4, 5}, new long[] {2, 7});
  }
}
