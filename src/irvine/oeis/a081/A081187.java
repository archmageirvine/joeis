package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081187 5th binomial transform of <code>(1,0,1,0,1,......), A059841</code>.
 * @author Sean A. Irvine
 */
public class A081187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081187() {
    super(new long[] {-24, 10}, new long[] {1, 5});
  }
}
