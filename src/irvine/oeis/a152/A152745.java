package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152745 5 times hexagonal numbers: <code>5*n*(2*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A152745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152745() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 30});
  }
}
