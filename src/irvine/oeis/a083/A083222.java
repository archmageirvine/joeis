package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083222 <code>a(n) = (4*5^n + (-5)^n)/5</code>.
 * @author Sean A. Irvine
 */
public class A083222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083222() {
    super(new long[] {25, 0}, new long[] {1, 3});
  }
}
