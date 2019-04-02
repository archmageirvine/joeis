package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014915 a(1)=1, a(n) = n*3^(n-1) + a(n-1).
 * @author Sean A. Irvine
 */
public class A014915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014915() {
    super(new long[] {9, -15, 7}, new long[] {1, 7, 34});
  }
}
