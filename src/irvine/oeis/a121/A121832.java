package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121832 Expansion of <code>1/(1-x-x^5-x^6)</code>.
 * @author Sean A. Irvine
 */
public class A121832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121832() {
    super(new long[] {1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2});
  }
}
