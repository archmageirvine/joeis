package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135453 <code>a(n) = 12*n^2</code>.
 * @author Sean A. Irvine
 */
public class A135453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135453() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 48});
  }
}
