package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072525 a(0) = 1; a(n+1) is smallest composite number &gt; a(n) such that a(n) + a(n+1) is prime.
 * @author Sean A. Irvine
 */
public class A072525 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(1);
        if (!t.isProbablePrime() && mA.add(t).isProbablePrime()) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
