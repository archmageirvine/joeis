package irvine.oeis.a055;

import irvine.math.factorial.Factorial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A055881 a(n) = largest m such that m! divides n.
 * @author Sean A. Irvine
 */
public class A055881 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z a(final Z n) {
    int k = 0;
    final int flen = Factorial.FACTORIAL.length;
    while (k < flen && n.modZ(Factorial.FACTORIAL[k]).isZero()) {
      ++k;
    }
    if (k >= flen) {
      Z fk = Z.valueOf(Factorial.FACTORIAL[flen - 1]).multiply(k);
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
