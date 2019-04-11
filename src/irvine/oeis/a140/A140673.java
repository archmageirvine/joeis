package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140673 <code>a(n) = 3*n*(n + 5)/2</code>.
 * @author Sean A. Irvine
 */
public class A140673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140673() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 21});
  }
}
