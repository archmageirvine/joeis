package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081201 7th binomial transform of (0,1,0,1,0,1,....), A000035.
 * @author Sean A. Irvine
 */
public class A081201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081201() {
    super(new long[] {-48, 14}, new long[] {0, 1});
  }
}
