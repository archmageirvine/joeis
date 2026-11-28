package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087577 Smallest number k such that k^n + 3 is a prime.
 * @author Sean A. Irvine
 */
public class A087577 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ZERO;
    while (true) {
      k = k.add(2);
      final Z t = k.pow(mN).add(3);
      if (t.isProbablePrime()) {
        return k;
      }
    }
  }
}

