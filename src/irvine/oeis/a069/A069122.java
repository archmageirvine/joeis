package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069122 Numbers k such that the squarefree part of k is greater than the squarefree part of (k+1).
 * @author Sean A. Irvine
 */
public class A069122 extends Sequence1 {

  private Z mA = Z.THREE;
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = Jaguar.factor(++mN).core();
      if (t.compareTo(mA) > 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

