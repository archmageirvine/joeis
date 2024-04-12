package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069209 Orders of non-Abelian Z-groups.
 * @author Sean A. Irvine
 */
public class A069209 extends Sequence1 {

  private long mN = 5;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      for (final Z q : fs.toZArray()) {
        if (q.mod(p).equals(Z.ONE)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

