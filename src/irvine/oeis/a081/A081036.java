package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081036 9th binomial transform of the periodic sequence (1,10,1,1,10,1...).
 * @author Sean A. Irvine
 */
public class A081036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081036() {
    super(new long[] {-80, 18}, new long[] {1, 19});
  }
}
