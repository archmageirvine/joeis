package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164039 a(n+1) = 3*a(n) - n.
 * @author Sean A. Irvine
 */
public class A164039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164039() {
    super(new long[] {3, -7, 5}, new long[] {1, 2, 4});
  }
}
