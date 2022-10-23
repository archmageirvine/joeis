package irvine.oeis.a057;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A057429 Numbers n such that (1+i)^n - 1 times its conjugate is prime.
 * @author Sean A. Irvine
 */
public class A057429 extends Sequence1 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Pair<Z, Z> C0 = new Pair<>(Z.ONE, Z.ONE);
  private Pair<Z, Z> mC = new Pair<>(Z.ONE, Z.ZERO);
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mC = G.multiply(mC, C0);
      final Pair<Z, Z> u = G.subtract(mC, G.one());
      final Z t = G.multiply(u, G.conjugate(u)).left();
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
