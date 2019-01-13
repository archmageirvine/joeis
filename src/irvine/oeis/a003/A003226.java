package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003226.
 * @author Sean A. Irvine
 */
public class A003226 implements Sequence {

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
