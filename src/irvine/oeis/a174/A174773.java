package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174773 y-values in the solution to <code>x^2 -</code> 34*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A174773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174773() {
    super(new long[] {-1, 70}, new long[] {0, 6});
  }
}
