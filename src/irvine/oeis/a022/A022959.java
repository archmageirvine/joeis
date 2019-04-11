package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022959 <code>3-n</code>.
 * @author Sean A. Irvine
 */
public class A022959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022959() {
    super(new long[] {-1, 2}, new long[] {3, 2});
  }
}
