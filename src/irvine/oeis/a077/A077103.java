package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077103 Numbers n such that gcd(a,b) is not equal to gcd(a+b,a-b), where a=sigma(n)=A000203(n) and b=phi(n)=A000010(n).
 * @author Sean A. Irvine
 */
public class A077103 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      final Z sigma = Functions.SIGMA1.z(mN);
      if (!sigma.add(phi).gcd(sigma.subtract(phi)).equals(sigma.gcd(phi))) {
        return Z.valueOf(mN);
      }
    }
  }
}

