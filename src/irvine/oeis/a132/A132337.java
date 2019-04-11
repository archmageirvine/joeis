package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132337 Sum of the integers from 1 to <code>n,</code> excluding the perfect sixth powers.
 * @author Sean A. Irvine
 */
public class A132337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132337() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 5});
  }
}
