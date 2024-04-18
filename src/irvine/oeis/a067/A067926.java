package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067926 a(n)=phi(n^2+1)/n if (n^2+1) is composite and phi(n^2+1)==0 (mod n).
 * @author Sean A. Irvine
 */
public class A067926 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().add(1);
      if (!t.isProbablePrime()) {
        final Z phi = Functions.PHI.z(t);
        if (phi.mod(mN) == 0) {
          return phi.divide(mN);
        }
      }
    }
  }
}
