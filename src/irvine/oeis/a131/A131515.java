package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131515 <code>a(n+2) = 34*a(n+1) - a(n) + 2</code>; <code>a(1) = 1</code> and <code>a(2) = 16</code>.
 * @author Sean A. Irvine
 */
public class A131515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131515() {
    super(new long[] {1, -35, 35}, new long[] {1, 16, 545});
  }
}
