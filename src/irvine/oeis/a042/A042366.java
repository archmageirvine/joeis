package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042366 Numerators of continued fraction convergents to sqrt(710).
 * @author Sean A. Irvine
 */
public class A042366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042366() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2558, 0, 0, 0, 0, 0, 0, 0}, new long[] {26, 27, 53, 80, 373, 453, 826, 1279, 67334, 68613, 135947, 204560, 954187, 1158747, 2112934, 3271681});
  }
}
