package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030431.
 * @author Sean A. Irvine
 */
public class A030431 implements Sequence {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(10);
      if (mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}

