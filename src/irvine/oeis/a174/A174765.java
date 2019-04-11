package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174765 y-values in the solution to <code> x^2 -</code> 19*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A174765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174765() {
    super(new long[] {-1, 340}, new long[] {0, 39});
  }
}
