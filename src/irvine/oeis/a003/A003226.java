package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003226 Automorphic numbers: m^2 ends with m.
 * @author Sean A. Irvine
 */
public class A003226 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (s.toString().endsWith(mN.toString())) {
        return mN;
      }
    }
  }
}
