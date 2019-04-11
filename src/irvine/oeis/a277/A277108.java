package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277108 <code>a(n) = 4n*(n+5)</code>.
 * @author Sean A. Irvine
 */
public class A277108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277108() {
    super(new long[] {1, -3, 3}, new long[] {24, 56, 96});
  }
}
