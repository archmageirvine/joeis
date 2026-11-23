package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087524 a(0) = 2, a(n)=smallest prime &gt; a(n-1) such that a(n) - a(n-1) == 0 mod n!.
 * @author Sean A. Irvine
 */
public class A087524 extends Sequence0 {

  private Z mA = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z mod = Functions.FACTORIAL.z(mN);
      Z t = mA.mod(mod);
      do {
        t = t.add(mod);
      } while (t.compareTo(mA) <= 0 || !t.isProbablePrime());
      mA = t;
    }
    return mA;
  }
}
