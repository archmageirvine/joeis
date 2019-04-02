package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002254 Numbers k such that 5*2^k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A002254 implements Sequence {

  private long mN = 0;
  private Z mM = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mM = mM.shiftLeft(1);
      if (mM.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
