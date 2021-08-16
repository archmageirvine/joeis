package irvine.oeis.a050;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050473 Smallest k such that phi(k+n)=2*phi(k).
 * @author Sean A. Irvine
 */
public class A050473 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      if (Euler.phi(Z.valueOf(++k)).multiply2().equals(Euler.phi(mN.add(k)))) {
        return Z.valueOf(k);
      }
    }
  }
}
