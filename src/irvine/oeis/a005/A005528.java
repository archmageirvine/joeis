package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005528 St\u00f8rmer numbers or arc-cotangent irreducible numbers: numbers k such that the largest prime factor of k^2 + 1 is &gt;= 2*k.
 * @author Sean A. Irvine
 */
public class A005528 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z lim = mN.multiply2();
      final FactorSequence fs = Cheetah.factor(mN.square().add(1));
      for (final Z p : fs.toZArray()) {
        if (p.compareTo(lim) >= 0) {
          return mN;
        }
      }
    }
  }
}
