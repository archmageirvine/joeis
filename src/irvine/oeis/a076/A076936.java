package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076936 <code>a(1) = 1;</code> then the smallest number different from its predecessor such that the n-th partial product is an n-th power.
 * @author Sean A. Irvine
 */
public class A076936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076936() {
    super(new long[] {-16, 0, 10, 0}, new long[] {1, 4, 2, 32});
  }
}
