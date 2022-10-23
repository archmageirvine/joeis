package irvine.oeis.a058;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A058770 Numbers n such that n * (1+i)^n + 1 is a Gaussian prime.
 * @author Sean A. Irvine
 */
public class A058770 extends Sequence1 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Pair<Z, Z> B = new Pair<>(Z.ONE, Z.ONE);
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Pair<Z, Z> candidate = G.add(G.multiply(G.pow(B, ++mN), G.coerce(mN)), G.one());
      if (G.isProbablePrime(candidate)) {
        return Z.valueOf(mN);
      }
    }
  }
}
