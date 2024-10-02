package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072437 Numbers with no prime factors of form 4*k+3.
 * @author Sean A. Irvine
 */
public class A072437 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    for (final Z p : Jaguar.factor(n).toZArray()) {
      if (p.mod(4) == 3) {
        return false;
      }
    }
    return true;
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

