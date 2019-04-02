package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042705 Denominators of continued fraction convergents to sqrt(882).
 * @author Sean A. Irvine
 */
public class A042705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042705() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 10, 63, 199, 461, 660, 38741, 39401, 117543, 392030, 2469723, 7801199, 18072121, 25873320});
  }
}
