package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162268 <code>a(n) = ((5+sqrt(2))*(1+sqrt(2))^n + (5-sqrt(2))*(1-sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A162268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162268() {
    super(new long[] {1, 2}, new long[] {5, 7});
  }
}
