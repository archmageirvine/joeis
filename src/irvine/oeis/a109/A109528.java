package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109528 a(n)= 3*a(n-3) +3*a(n-6) +a(n-9).
 * @author Sean A. Irvine
 */
public class A109528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109528() {
    super(new long[] {1, 0, 0, 3, 0, 0, 3, 0, 0}, new long[] {0, 1, 3, 1, 2, 12, 2, 9, 45});
  }
}
