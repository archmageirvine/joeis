package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042238 Numerators of continued fraction convergents to sqrt(645).
 * @author Sean A. Irvine
 */
public class A042238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042238() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2048002, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {25, 51, 76, 127, 1600, 16127, 195124, 211251, 406375, 1024001, 51606425, 104236851, 155843276, 260080127, 3276804800L, 33028128127L, 399614342324L, 432642470451L, 832256812775L, 2097156096001L});
  }
}
