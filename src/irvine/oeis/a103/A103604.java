package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103604.
 * @author Sean A. Irvine
 */
public class A103604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103604() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {210, 3234, 25872, 144144, 630630, 2312310, 7399392, 21237216, 55747692, 135795660, 310390080, 671571264, 1385115732});
  }
}
