package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042125 Denominators of continued fraction convergents to sqrt(587).
 * @author Sean A. Irvine
 */
public class A042125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042125() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3814324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 9, 13, 22, 35, 57, 1346, 1403, 2749, 4152, 6901, 17954, 78717, 3796370, 15264197, 34324764, 49588961, 83913725, 133502686, 217416411, 5134080139L, 5351496550L, 10485576689L, 15837073239L, 26322649928L, 68482373095L, 300252142308L});
  }
}
