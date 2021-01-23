package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125819 a(n) = ((1 + 7*sqrt(2))^n - (1 - 7*sqrt(2))^n)/(14*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A125819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125819() {
    super(new long[] {97, 2}, new long[] {0, 1});
  }
}
