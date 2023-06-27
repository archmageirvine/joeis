package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014916 a(1)=1, a(n) = n*4^(n-1) + a(n-1).
 * @author Sean A. Irvine
 */
public class A014916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014916() {
    super(1, new long[] {16, -24, 9}, new long[] {1, 9, 57});
  }
}
