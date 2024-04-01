package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069062 Numbers k such that k^2-1 and k^2+1 have the same number of positive divisors.
 * @author Sean A. Irvine
 */
public class A069062 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z t = n.square();
      if (Jaguar.factor(t.subtract(1)).sigma0().equals(Jaguar.factor(t.add(1)).sigma0())) {
        return n;
      }
    }
  }
}

