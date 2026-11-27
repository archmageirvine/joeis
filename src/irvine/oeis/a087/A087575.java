package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087575 Smallest prime p such that 2+p^n is a prime, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A087575 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      final Z t = Z.THREE.pow(mN).add(2);
      return t.isProbablePrime() ? Z.THREE : Z.ZERO;
    }
    Z p = Z.TWO;
    while (true) {
      p = Functions.NEXT_PRIME.z(p);
      final Z t = p.pow(mN).add(2);
      if (t.isProbablePrime()) {
        return p;
      }
    }
  }
}

