package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053796 <code>n^2+n</code> modulo 5.
 * @author Sean A. Irvine
 */
public class A053796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053796() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 2, 1, 2, 0});
  }
}
