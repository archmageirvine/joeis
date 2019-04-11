package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168668 <code>a(n) = n*(2 + 5*n)</code>.
 * @author Sean A. Irvine
 */
public class A168668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168668() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 24});
  }
}
