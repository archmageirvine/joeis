package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158637 <code>a(n) = 576*n^2 + 24</code>.
 * @author Sean A. Irvine
 */
public class A158637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158637() {
    super(new long[] {1, -3, 3}, new long[] {24, 600, 2328});
  }
}
