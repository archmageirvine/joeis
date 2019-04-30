package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060531 9th binomial transform of <code>(1,0,1,0,1,...)</code>, A059841.
 * @author Sean A. Irvine
 */
public class A060531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060531() {
    super(new long[] {-80, 18}, new long[] {1, 9});
  }
}
