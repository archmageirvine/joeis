package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020136 Fermat pseudoprimes to base 4.
 * @author Sean A. Irvine
 */
public class A020136 implements Sequence {

  private Z mN = Z.valueOf(13);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Z.FOUR.modPow(mN.subtract(1), mN).equals(Z.ONE) && !mN.isPrime()) {
        return mN;
      }
    }
  }
}
