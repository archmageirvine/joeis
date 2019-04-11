package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022961 <code>5-n</code>.
 * @author Sean A. Irvine
 */
public class A022961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022961() {
    super(new long[] {-1, 2}, new long[] {5, 4});
  }
}
