package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041120 Numerators of continued fraction convergents to sqrt(69).
 * @author Sean A. Irvine
 */
public class A041120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041120() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 15550, 0, 0, 0, 0, 0, 0, 0}, new long[] {8, 25, 83, 108, 515, 623, 2384, 7775, 126784, 388127, 1291165, 1679292, 8008333, 9687625, 37071208, 120901249});
  }
}
