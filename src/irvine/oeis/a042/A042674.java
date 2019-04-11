package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042674 Numerators of continued fraction convergents to <code>sqrt(867)</code>.
 * @author Sean A. Irvine
 */
public class A042674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042674() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 140452, 0, 0, 0, 0, 0}, new long[] {29, 59, 265, 7744, 31241, 70226, 4104349, 8278924, 37220045, 1087660229, 4387860961L, 9863382151L});
  }
}
