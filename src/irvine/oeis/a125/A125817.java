package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125817 a(n) = ((1 + 3*sqrt(2))^n - (1 - 3*sqrt(2))^n)/(2*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A125817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125817() {
    super(new long[] {17, 2}, new long[] {0, 3});
  }
}
