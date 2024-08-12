package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071873 Decimal expansion of the sixth (of 10) decimal selvage number; the n-th digit of a decimal selvage number, x, is equal to the tenths digit of n*x.
 * @author Sean A. Irvine
 */
public class A071873 extends A071789 {

  /** Construct the sequence. */
  public A071873() {
    super(Z.FIVE, Z.ZERO, Z.FIVE);
  }
}
