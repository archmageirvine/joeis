package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174333 <code>61*n^2</code>.
 * @author Sean A. Irvine
 */
public class A174333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174333() {
    super(new long[] {1, -3, 3}, new long[] {0, 61, 244});
  }
}
