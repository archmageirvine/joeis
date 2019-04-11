package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038754 <code>a(2n) = 3^n, a(2n+1) = 2*3^n</code>.
 * @author Sean A. Irvine
 */
public class A038754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038754() {
    super(new long[] {3, 0}, new long[] {1, 2});
  }
}
