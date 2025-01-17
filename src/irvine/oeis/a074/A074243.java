package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074243 Numbers n such that every integer has a cube root mod n.
 * @author Sean A. Irvine
 */
public class A074243 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.isSquareFree()) {
      for (final Z p : fs.toZArray()) {
        if (p.mod(3) == 1) {
          return false;
        }
      }
      return true;
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
