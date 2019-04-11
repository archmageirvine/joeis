package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118015 <code>a(n) = floor(n^2/5)</code>.
 * @author Sean A. Irvine
 */
public class A118015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118015() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 0, 0, 1, 3, 5, 7});
  }
}
