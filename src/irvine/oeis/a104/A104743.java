package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104743 Numbers <code>m=n+3^n</code> such that equation <code>x=3^(m-x)</code> has solution <code>x=3^n</code>.
 * @author Sean A. Irvine
 */
public class A104743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104743() {
    super(new long[] {3, -7, 5}, new long[] {1, 4, 11});
  }
}
