package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022981 <code>25-n</code>.
 * @author Sean A. Irvine
 */
public class A022981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022981() {
    super(new long[] {-1, 2}, new long[] {25, 24});
  }
}
