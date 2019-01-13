package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015721.
 * @author Sean A. Irvine
 */
public class A015721 implements Sequence {

  private Z mN = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (A015709.is(mN)) {
        return mN;
      }
    }
  }
}
