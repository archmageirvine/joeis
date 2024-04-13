package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081988 Product of digits + 1 is a prime.
 * @author Georg Fischer
 */
public class A081988 extends Sequence1 {

  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (Functions.DIGIT_PRODUCT.z(mK).add(1).isPrime()) {
        return mK;
      }
    }
  }
}
