package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168331 <code>a(n) = (5 + 14*n + 7*(-1)^n)/4</code>.
 * @author Sean A. Irvine
 */
public class A168331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168331() {
    super(new long[] {-1, 1, 1}, new long[] {3, 10, 10});
  }
}
