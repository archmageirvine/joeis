package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081251 Numbers n such that <code>A081249(m)/m^2</code> has a local maximum for m = n.
 * @author Sean A. Irvine
 */
public class A081251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081251() {
    super(new long[] {-3, 1, 3}, new long[] {2, 6, 20});
  }
}
