package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158626 <code>a(n) = 42*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158626() {
    super(new long[] {1, -3, 3}, new long[] {41, 167, 377});
  }
}
