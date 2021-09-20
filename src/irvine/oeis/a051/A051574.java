package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051574 a(n) = number of k, 1&lt;=k&lt;=n, such that (n*k) divides binomial(n,k).
 * @author Sean A. Irvine
 */
public class A051574 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Binomial.binomial(mN, k).mod(mN * k) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
