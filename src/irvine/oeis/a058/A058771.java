package irvine.oeis.a058;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A058771 Numbers k such that k * (1+i)^k - 1 is a Gaussian prime.
 * @author Sean A. Irvine
 */
public class A058771 extends Sequence1 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Zi B = new Zi(Z.ONE, Z.ONE);
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Zi candidate = G.subtract(G.multiply(G.pow(B, ++mN), G.coerce(mN)), G.one());
      //System.out.println(mN + " " + candidate);
      if (candidate.im().isZero() && candidate.re().abs().isProbablePrime()) {
        return Z.valueOf(mN);
      }
      if (G.isProbablePrime(candidate)) {
        return Z.valueOf(mN);
      }
    }
  }
}
