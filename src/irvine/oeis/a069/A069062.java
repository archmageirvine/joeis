package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069044.
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

