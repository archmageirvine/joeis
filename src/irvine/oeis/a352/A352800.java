package irvine.oeis.a352;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A352800.
 * @author Sean A. Irvine
 */
public class A352800 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().multiply2().add(29);
      if (p.isProbablePrime()) {
        return mN;
      }
    }
  }
}

