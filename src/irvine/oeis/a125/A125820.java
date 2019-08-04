package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125820 <code>a(n) = ((1 + 7*sqrt(2))^n + (1 - 7*sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A125820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125820() {
    super(new long[] {97, 2}, new long[] {1, 1});
  }
}
