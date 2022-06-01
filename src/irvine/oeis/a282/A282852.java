package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282852 37-gonal numbers: a(n) = n*(35*n-33)/2.
 * @author Sean A. Irvine
 */
public class A282852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282852() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 37});
  }
}
