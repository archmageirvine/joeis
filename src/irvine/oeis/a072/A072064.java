package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072064 Least k&gt;0 such that prime(n)+k*n is prime.
 * @author Sean A. Irvine
 */
public class A072064 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z p = super.next();
    long k = 0;
    while (true) {
      ++k;
      p = p.add(mN);
      if (p.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
