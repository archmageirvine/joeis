package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174751 x-values in the solution to <code>x^2-39*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174751() {
    super(new long[] {-1, 50}, new long[] {1, 25});
  }
}
