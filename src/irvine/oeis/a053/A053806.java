package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A053806 Numbers where a gap begins in the sequence of squarefree numbers (A005117).
 * @author Sean A. Irvine
 */
public class A053806 extends A005117 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z u = mPrev;
      mPrev = super.next();
      final Z t = mPrev.subtract(u).subtract(1);
      if (!t.isZero()) {
        return u.add(1);
      }
    }
  }
}

