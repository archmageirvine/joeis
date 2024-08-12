package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071875 Decimal expansion of the eighth (of 10) decimal selvage number; the n-th digit of a decimal selvage number, x, is equal to the tenths digit of n*x.
 * @author Sean A. Irvine
 */
public class A071875 extends A071789 {

  /** Construct the sequence. */
  public A071875() {
    super(Z.SEVEN, Z.FOUR, Z.TWO);
  }
}
