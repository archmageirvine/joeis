package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171842 Binomial transform of <code>1,0,1,0,2,0,4,0,8,0,16,..</code>.
 * @author Sean A. Irvine
 */
public class A171842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171842() {
    super(new long[] {-1, -1, 3}, new long[] {1, 1, 2});
  }
}
