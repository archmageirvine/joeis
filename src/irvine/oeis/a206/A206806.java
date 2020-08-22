package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206806 Sum_{0&lt;j&lt;k&lt;=n} s(k)-s(j), where s(j)=A002620(j) is the j-th quarter-square.
 * @author Sean A. Irvine
 */
public class A206806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206806() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {1, 4, 13, 30, 62, 112, 190});
  }
}
