package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050473 Smallest k such that phi(k+n)=2*phi(k).
 * @author Sean A. Irvine
 */
public class A050473 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z n = Z.valueOf(++k);
      if (Functions.PHI.z(n).multiply2().equals(Functions.PHI.z(mN.add(k)))) {
        return Z.valueOf(k);
      }
    }
  }
}
