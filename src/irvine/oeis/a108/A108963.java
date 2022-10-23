package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A108963 Smallest prime == 1 (mod f(n)), where f(n) = concatenation n,(n-1),...,3,2,1,2,3,...(n-1),n.
 * @author Sean A. Irvine
 */
public class A108963 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = mN; k >= 1; --k) {
      sb.append(k);
    }
    for (int k = 2; k <= mN; ++k) {
      sb.append(k);
    }
    final Z modulus = new Z(sb);
    Z p = modulus.add(1);
    while (!p.isProbablePrime()) {
      p = p.add(modulus);
    }
    return p;
  }
}

