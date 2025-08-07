package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079310 Numbers k such that (6*phi(k)-1, 6*phi(k)+1) is a twin prime pair, where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A079310 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z phi6 = Functions.PHI.z(++mN).multiply(6);
      if (phi6.subtract(1).isProbablePrime() && phi6.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
