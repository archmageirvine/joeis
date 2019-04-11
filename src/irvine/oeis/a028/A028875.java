package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028875 <code>a(n) = n^2 - 5</code>.
 * @author Sean A. Irvine
 */
public class A028875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028875() {
    super(new long[] {1, -3, 3}, new long[] {-5, -4, -1});
  }
}
