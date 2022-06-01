package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014927 a(1)=1, a(n) = n*12^(n-1) + a(n-1).
 * @author Sean A. Irvine
 */
public class A014927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014927() {
    super(new long[] {144, -168, 25}, new long[] {1, 25, 457});
  }
}
