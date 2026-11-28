package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087576 Smallest number k &gt; 1 such that k^n+2 is prime.
 * @author Sean A. Irvine
 */
public class A087576 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ONE;
    while (true) {
      k = k.add(2);
      final Z t = k.pow(mN).add(2);
      if (t.isProbablePrime()) {
        return k;
      }
    }
  }
}

