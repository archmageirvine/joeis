package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081107 7th binomial transform of (1,1,0,0,0,0,.......).
 * @author Sean A. Irvine
 */
public class A081107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081107() {
    super(new long[] {-49, 14}, new long[] {1, 8});
  }
}
