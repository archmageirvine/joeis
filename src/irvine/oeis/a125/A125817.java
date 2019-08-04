package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125817 <code>a(n) = ((1 + 3*sqrt(2))^n - (1 - 3*sqrt(2))^n)/(2*sqrt(2))</code>.
 * @author Sean A. Irvine
 */
public class A125817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125817() {
    super(new long[] {17, 2}, new long[] {0, 3});
  }
}
