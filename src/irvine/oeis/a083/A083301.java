package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083301 <code>a(n) = (4*8^n + (-2)^n)/5</code>.
 * @author Sean A. Irvine
 */
public class A083301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083301() {
    super(new long[] {16, 6}, new long[] {1, 6});
  }
}
