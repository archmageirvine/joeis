package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174749 x-values in the solution to <code>x^2-34*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174749() {
    super(new long[] {-1, 70}, new long[] {1, 35});
  }
}
