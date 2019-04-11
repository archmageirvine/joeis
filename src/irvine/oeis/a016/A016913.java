package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016913 <code>a(n) = (6*n)^5</code>.
 * @author Sean A. Irvine
 */
public class A016913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016913() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 7776, 248832, 1889568, 7962624, 24300000});
  }
}
