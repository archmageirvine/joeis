package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167544 <code>a(n) = (n-3)*(n-8)/2 </code>.
 * @author Sean A. Irvine
 */
public class A167544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167544() {
    super(new long[] {1, -3, 3}, new long[] {-2, -3, -3});
  }
}
