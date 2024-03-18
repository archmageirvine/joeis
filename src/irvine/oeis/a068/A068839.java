package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068839 Smallest prime that ends with the right concatenation of first n odd numbers.
 * @author Sean A. Irvine
 */
public class A068839 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    mA.insert(0, mN);
    final Z t = new Z(mA);
    if (t.isProbablePrime()) {
      return t;
    }
    long k = 0;
    while (true) {
      final Z u = new Z(++k + mA.toString());
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
