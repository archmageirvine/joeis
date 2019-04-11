package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083582 <code>a(n) = (8*2^n-5*(-1)^n)/3</code>.
 * @author Sean A. Irvine
 */
public class A083582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083582() {
    super(new long[] {2, 1}, new long[] {1, 7});
  }
}
