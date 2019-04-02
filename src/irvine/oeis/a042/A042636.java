package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042636 Numerators of continued fraction convergents to sqrt(848).
 * @author Sean A. Irvine
 */
public class A042636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042636() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 132498, 0, 0, 0, 0, 0}, new long[] {29, 233, 728, 2417, 7979, 66249, 3850421, 30869617, 96459272, 320247433, 1057201571, 8777860001L});
  }
}
