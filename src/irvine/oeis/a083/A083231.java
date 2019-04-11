package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083231 <code>a(n) = (3*5^n + (-3)^n)/4</code>.
 * @author Sean A. Irvine
 */
public class A083231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083231() {
    super(new long[] {15, 2}, new long[] {1, 3});
  }
}
