package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015721 Composite and even n such that <code>phi(n) * sigma(n)</code> is one less than a square.
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
