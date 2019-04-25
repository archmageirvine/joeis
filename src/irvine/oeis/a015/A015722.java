package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015722 Odd composite n such that phi(n) <code>* sigma(n)</code> is one less than a square.
 * @author Sean A. Irvine
 */
public class A015722 implements Sequence {

  private Z mN = Z.valueOf(31);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime() && A015709.is(mN)) {
        return mN;
      }
    }
  }
}
