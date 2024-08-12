package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071793 Decimal expansion of the fifth (of 10) decimal selvage number; the n-th digit of a decimal selvage number, x, is equal to the tenths digit of n*x.
 * @author Sean A. Irvine
 */
public class A071793 extends A071789 {

  /** Construct the sequence. */
  public A071793() {
    super(Z.FOUR, Z.NINE, Z.FOUR);
  }
}
