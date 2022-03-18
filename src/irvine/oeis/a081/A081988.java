package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A081988 Product of digits + 1 is a prime.
 * @author Georg Fischer
 */
public class A081988 implements Sequence {

  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (ZUtils.digitProduct(mK).add(1).isPrime()) {
        return mK;
      }
    }
  }
}
