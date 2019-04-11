package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134057 <code>a(n) =</code> binomial(2^n-1,2).
 * @author Sean A. Irvine
 */
public class A134057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134057() {
    super(new long[] {8, -14, 7}, new long[] {0, 0, 3});
  }
}
