package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081253 Numbers n such that A081252(m)/m^2 has a local minimum for m <code>= n</code>.
 * @author Sean A. Irvine
 */
public class A081253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081253() {
    super(new long[] {-2, 1, 2}, new long[] {2, 4, 9});
  }
}
