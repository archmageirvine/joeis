package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109731 <code>a(n) = - 4*a(n-2) - a(n-4), a(0) = 1, a(1) = -4, a(2) = -6, a(3) = 15</code>.
 * @author Sean A. Irvine
 */
public class A109731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109731() {
    super(new long[] {-1, 0, -4, 0}, new long[] {1, -4, -6, 15});
  }
}
