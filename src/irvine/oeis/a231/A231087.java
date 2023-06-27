package irvine.oeis.a231;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A231087 Number of perfect matchings in graph C_3 x C_{2n}.
 * @author Sean A. Irvine
 */
public class A231087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231087() {
    super(2, new long[] {1, -6, 6}, new long[] {50, 224, 1058});
  }
}
