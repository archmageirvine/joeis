package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071791 Decimal expansion of the third (of 10) decimal selvage numbers; the n-th digit of a decimal selvage number, x, is equal to the tenths digit of n*x.
 * @author Sean A. Irvine
 */
public class A071791 extends A071789 {

  /** Construct the sequence. */
  public A071791() {
    super(Z.TWO, Z.FIVE, Z.SEVEN);
  }
}
