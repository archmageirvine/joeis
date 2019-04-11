package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014916 <code>a(1)=1, a(n) = n*4^(n-1) + a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A014916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014916() {
    super(new long[] {16, -24, 9}, new long[] {1, 9, 57});
  }
}
