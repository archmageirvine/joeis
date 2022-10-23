package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036014 a(n) is the smallest number such that the product a(1)a(2)...a(n) falls between a twin prime pair, starting with a(1)=2.
 * @author Sean A. Irvine
 */
public class A036014 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    long k = 1;
    while (true) {
      final Z t = mA.multiply(++k);
      if (t.subtract(1).isProbablePrime() && t.add(1).isProbablePrime()) {
        mA = t;
        return Z.valueOf(k);
      }
    }
  }
}

