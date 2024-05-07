package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069612 a(1) = 19 (the smallest prime ending in a 9) and a(n+1) = smallest prime ending in a(n).
 * @author Sean A. Irvine
 */
public class A069612 extends Sequence1 {

  private String mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "19";
      return Z.valueOf(19);
    }
    long k = 0;
    while (true) {
      final Z t = new Z(++k + mA);
      if (t.isProbablePrime()) {
        mA = t.toString();
        return t;
      }
    }
  }
}
