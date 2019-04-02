package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042015 Denominators of continued fraction convergents to sqrt(531).
 * @author Sean A. Irvine
 */
public class A042015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042015() {
    super(new long[] {-1, 0, 1060, 0}, new long[] {1, 23, 1059, 24380});
  }
}
