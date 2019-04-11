package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275591 <code>a(n) = n^2 + 9*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A275591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275591() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 23});
  }
}
