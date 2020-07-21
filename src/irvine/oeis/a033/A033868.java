package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033868 Numbers n such that <code>7*n-11</code> is prime.
 * @author Sean A. Irvine
 */
public class A033868 implements Sequence {

  private Z mN = Z.valueOf(-11);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(14);
      if (mN.isProbablePrime()) {
        return mN.add(11).divide(7);
      }
    }
  }
}
