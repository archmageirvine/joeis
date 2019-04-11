package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083424 <code>a(n) = (5*4^n + (-2)^n)/6</code>.
 * @author Sean A. Irvine
 */
public class A083424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083424() {
    super(new long[] {8, 2}, new long[] {1, 3});
  }
}
