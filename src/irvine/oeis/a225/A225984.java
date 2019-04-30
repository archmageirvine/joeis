package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225984 Linear recurrence sequence with infrequent pseudoprimes, <code>a(n) = -a(n-1) + a(n-2) - a(n-3) + a(n-5)</code>, with initial terms <code>(5, -1, 3, -7, 11)</code>.
 * @author Sean A. Irvine
 */
public class A225984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225984() {
    super(new long[] {1, 0, -1, 1, -1}, new long[] {5, -1, 3, -7, 11});
  }
}
