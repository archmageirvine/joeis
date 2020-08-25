package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034376 Cubes with all digits even.
 * @author Sean A. Irvine
 */
public class A034376 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z cube = mN.pow(3);
      if ((ZUtils.syn(cube) & 0b1010101010) == 0) {
        return cube;
      }
    }
  }
}
