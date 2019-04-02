package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041886 Numerators of continued fraction convergents to sqrt(465).
 * @author Sean A. Irvine
 */
public class A041886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041886() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 31742, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {21, 22, 43, 151, 345, 841, 2027, 6922, 8949, 15871, 675531, 691402, 1366933, 4792201, 10951335, 26694871, 64341077, 219718102, 284059179, 503777281});
  }
}
