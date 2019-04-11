package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081186 4th binomial transform of <code>(1,0,1,0,1,......),</code> A059841.
 * @author Sean A. Irvine
 */
public class A081186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081186() {
    super(new long[] {-15, 8}, new long[] {1, 4});
  }
}
