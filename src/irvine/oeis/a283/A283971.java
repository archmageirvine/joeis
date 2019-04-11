package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283971 <code>a(n) = n</code> except <code>a(4*n + 2) = 2*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A283971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283971() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 1, 3, 4, 5, 3, 7});
  }
}
