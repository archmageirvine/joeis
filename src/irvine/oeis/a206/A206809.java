package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206809 a(n) = Sum_{0&lt;j&lt;k&lt;=n} k^3-j^3.
 * @author Sean A. Irvine
 */
public class A206809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206809() {
    super(2, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {7, 52, 208, 608, 1463, 3080});
  }
}
