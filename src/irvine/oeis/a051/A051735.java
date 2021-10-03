package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051735 Binomial coefficients C(n,k) such that C(n,k)-1 and C(n,k)+1 are twin primes and 2&lt;=k&lt;=floor(n/2).
 * @author Sean A. Irvine
 */
public class A051735 implements Sequence {

  private long mN = 4;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      if (2 * ++mM > mN) {
        ++mN;
        mM = 2;
      }
      final Z b = Binomial.binomial(mN, mM);
      if (b.subtract(1).isProbablePrime() && b.add(1).isProbablePrime()) {
        return b;
      }
    }
  }
}
