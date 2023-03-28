package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038862 Numbers ending with '7' that are the difference of two positive cubes.
 * @author Sean A. Irvine
 */
public class A038862 extends Sequence1 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(10);
      final Z lim = mN.sqrt();
      for (Z x = Z.ONE; x.compareTo(lim) <= 0; x = x.add(1)) {
        if (ZUtils.isCube(mN.add(x.pow(3)))) {
          return mN;
        }
      }
    }
  }
}
