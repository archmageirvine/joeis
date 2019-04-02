package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042314 Numerators of continued fraction convergents to sqrt(684).
 * @author Sean A. Irvine
 */
public class A042314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042314() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 115598, 0, 0, 0, 0, 0, 0, 0}, new long[] {26, 157, 183, 340, 4263, 4603, 8866, 57799, 3014414, 18144283, 21158697, 39302980, 492794457, 532097437, 1024891894, 6681448801L});
  }
}
