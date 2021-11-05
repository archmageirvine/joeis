package irvine.oeis.a336;
// manually deris2/essent at 2021-11-04

import irvine.math.z.Z;
import irvine.oeis.a006.A006885;

/**
 * A336994 Entries of A336938 without duplicates.
 * Is this (apart from the first 2 entries) the same as A006885?
 * @author Georg Fischer
 */
public class A336994 extends A006885 {

  private int mN = 0;

  /** Construct the sequence. */
  public A336994() {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ZERO;
    } else if (mN == 2) {
      return Z.FOUR;
    } else {
      return super.next();
    }
  }
}
