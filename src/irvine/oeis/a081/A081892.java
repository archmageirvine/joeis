package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081892 Second binomial transform of C(n+2,2).
 * @author Sean A. Irvine
 */
public class A081892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081892() {
    super(new long[] {27, -27, 9}, new long[] {1, 5, 22});
  }
}
