package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282851 35-gonal numbers: <code>a(n) = n*(33*n-31)/2</code>.
 * @author Sean A. Irvine
 */
public class A282851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282851() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 35});
  }
}
