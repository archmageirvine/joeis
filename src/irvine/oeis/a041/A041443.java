package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041443 Denominators of continued fraction convergents to sqrt(237).
 * @author Sean A. Irvine
 */
public class A041443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041443() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 456302, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 38, 385, 2733, 3118, 5851, 14820, 450451, 915722, 1366173, 2281895, 17339438, 175676275, 1247073363, 1422749638, 2669823001L, 6762395640L});
  }
}
