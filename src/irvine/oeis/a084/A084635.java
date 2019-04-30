package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084635 Binomial transform of 1,0,1,0,1,1,1,...
 * @author Sean A. Irvine
 */
public class A084635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084635() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 1, 2, 4, 8});
  }
}
