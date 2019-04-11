package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081034 7th binomial transform of the periodic sequence <code>(1,8,1,1,8,1...)</code>.
 * @author Sean A. Irvine
 */
public class A081034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081034() {
    super(new long[] {-48, 14}, new long[] {1, 15});
  }
}
