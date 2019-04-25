package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174752 x-values in the solution to <code>x^2-41*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174752() {
    super(new long[] {-1, 4098}, new long[] {1, 2049});
  }
}
