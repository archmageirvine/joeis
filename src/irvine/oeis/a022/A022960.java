package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022960 <code>4-n</code>.
 * @author Sean A. Irvine
 */
public class A022960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022960() {
    super(new long[] {-1, 2}, new long[] {4, 3});
  }
}
