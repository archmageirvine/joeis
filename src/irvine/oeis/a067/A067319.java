package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067319 Numbers n such that phi(n)^phi(n)+1 is prime.
 * @author Sean A. Irvine
 */
public class A067319 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      if (phi.pow(phi).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

