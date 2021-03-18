package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045674 Number of 2n-bead balanced binary necklaces which are equivalent to their reverse, complement and reversed complement.
 * @author Sean A. Irvine
 */
public class A045674 implements Sequence {

  // After Andrew Howroyd

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    int m = mN;
    while ((m & 1) == 0) {
      m >>>= 1;
      sum = sum.add(Z.ONE.shiftLeft(m - 1));
    }
    return sum.add(Z.ONE.shiftLeft(m / 2));
  }
}

