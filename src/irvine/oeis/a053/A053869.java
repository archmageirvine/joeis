package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053869 Sum of divisors of n less than n is even.
 * @author Sean A. Irvine
 */
public class A053869 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.isOdd()) {
        if (mN.isSquare()) {
          return mN;
        }
      } else {
        if (!mN.isSquare() && ! mN.divide2().isSquare()) {
          return mN;
        }
      }
    }
  }
}
