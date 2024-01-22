package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A055881 a(n) = largest m such that m! divides n.
 * @author Sean A. Irvine
 */
public class A055881 extends Sequence1 implements DirectSequence {

  private int mN = 0;
  private static final long[] FACTORIAL = new long[]{1, 1, 2, 6, 24,
    120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L,
    20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L // 20!
  };

  @Override
  public Z a(final Z n) {
    int k = 0;
    final int flen = FACTORIAL.length;
    while (k < flen && n.modZ(FACTORIAL[k]).isZero()) {
      ++k;
    }
    if (k >= flen) {
      Z fk = Z.valueOf(FACTORIAL[flen - 1]).multiply(k);
      while (n.mod(fk).isZero()) {
        ++k;
        fk = fk.multiply(k);
      }
    }
    return Z.valueOf(k - 1);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
