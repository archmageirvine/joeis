package irvine.oeis.a057;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A057429 Numbers n such that (1+i)^n - 1 times its conjugate is prime.
 * @author Sean A. Irvine
 */
public class A057429 extends Sequence1 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Zi C0 = new Zi(Z.ONE, Z.ONE);
  private Zi mC = new Zi(Z.ONE, Z.ZERO);
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mC = G.multiply(mC, C0);
      final Zi u = G.subtract(mC, G.one());
      final Z t = G.multiply(u, G.conjugate(u)).re();
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
