package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080121 a(n) is the smallest k &gt; 0 such that n^2^k + (n+1)^2^k is prime, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A080121 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z n1 = Z.valueOf(mN + 1);
    long k = 0;
    Z j = Z.ONE;
    while (true) {
      ++k;
      j = j.multiply2();
      if (n1.pow(j).add(n.pow(j)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

