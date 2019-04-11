package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002261 Numbers k such that <code>11*2^k+1</code> is prime.
 * @author Sean A. Irvine
 */
public class A002261 implements Sequence {

  private long mN = 0;
  private Z mM = Z.valueOf(11);

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
