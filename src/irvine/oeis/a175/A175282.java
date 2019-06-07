package irvine.oeis.a175;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A175282 Positive numbers n with property that <code>n^2+3n+9</code> is prime <code>(A005471)</code>.
 * @author Sean A. Irvine
 */
public class A175282 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN.multiply(3)).add(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
