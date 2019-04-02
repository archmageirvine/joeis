package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282850 38-gonal numbers: a(n) = n*(18*n-17).
 * @author Sean A. Irvine
 */
public class A282850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282850() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 38});
  }
}
