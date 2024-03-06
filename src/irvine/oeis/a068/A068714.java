package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068701.
 * @author Sean A. Irvine
 */
public class A068714 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      final Z t = new Z("2" + mT.toString());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
