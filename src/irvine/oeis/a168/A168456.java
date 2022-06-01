package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168456 a(n) = (10*n - 5*(-1)^n + 1)/2.
 * @author Sean A. Irvine
 */
public class A168456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168456() {
    super(new long[] {-1, 1, 1}, new long[] {8, 8, 18});
  }
}
