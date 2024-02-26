package irvine.oeis.a027;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A027206 Numbers m such that (1+i)^m + i is a Gaussian prime.
 * @author Sean A. Irvine
 */
public class A027206 extends Sequence1 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Zi C0 = new Zi(Z.ONE, Z.ONE);
  private Zi mC = new Zi(Z.ONE, Z.ZERO);
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mC = G.multiply(mC, C0);
      }
      final Zi u = G.add(mC, G.i());
      final Z t = G.multiply(u, G.conjugate(u)).re();
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
      if ((mN & 3) == 2 && Z.ONE.shiftLeft(mN / 2).signedAdd(((mN - 2) & 4) == 0, Z.ONE).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
