package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014929 a(1)=1, a(n) = n*14^(n-1) + a(n-1).
 * @author Sean A. Irvine
 */
public class A014929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014929() {
    super(new long[] {196, -224, 29}, new long[] {1, 29, 617});
  }
}
