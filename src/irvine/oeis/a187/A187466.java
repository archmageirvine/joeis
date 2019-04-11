package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187466 <code>a(n) = 9^n mod 11</code>.
 * @author Sean A. Irvine
 */
public class A187466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187466() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 9, 4, 3, 5});
  }
}
