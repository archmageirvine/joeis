package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005712 Coefficient of <code>x^4</code> in expansion of <code>(1+x+x^2)^n</code>.
 * @author Sean A. Irvine
 */
public class A005712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005712() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6, 19, 45, 90});
  }
}

