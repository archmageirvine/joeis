package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069705 <code>a(n) = 2^n mod 7</code>.
 * @author Sean A. Irvine
 */
public class A069705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069705() {
    super(new long[] {1, 0, 0}, new long[] {1, 2, 4});
  }
}
