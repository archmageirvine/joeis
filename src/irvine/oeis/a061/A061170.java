package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061170.
 * @author Sean A. Irvine
 */
public class A061170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061170() {
    super(new long[] {-1, 12, -58, 144, -195, 144, -58, 12}, new long[] {1, 70, 905, 6666, 37580, 181074, 786715, 3176210});
  }
}
