package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065027 a(n) is the smallest k &gt; 0 such that n^k &lt; k!.
 * @author Sean A. Irvine
 */
public class A065027 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z f = Z.ONE;
    Z m = Z.valueOf(mN);
    long k = 1;
    while (m.compareTo(f) >= 0) {
      f = f.multiply(++k);
      m = m.multiply(mN);
    }
    return Z.valueOf(k);
  }
}

