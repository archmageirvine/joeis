package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024196 <code>a(n) =</code> 2nd elementary symmetric function of the first <code>n+1</code> odd positive integers.
 * @author Sean A. Irvine
 */
public class A024196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024196() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 23, 86, 230, 505});
  }
}
