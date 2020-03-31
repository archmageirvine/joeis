package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030294 Numbers n such that <code>n^3</code> has at most three different digits.
 * @author Sean A. Irvine
 */
public class A030294 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z cube = mN.pow(3);
      if (Integer.bitCount(ZUtils.syn(cube)) <= 3) {
        return mN;
      }
    }
  }
}
