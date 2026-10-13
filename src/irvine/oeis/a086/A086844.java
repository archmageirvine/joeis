package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A086844 Odd numbers m such that the sequence defined by b(1) = m; for k&gt;1, b(k) = floor((1+sqrt(3))*b(k-1)) contains only odd numbers.
 * @author Sean A. Irvine
 */
public class A086844 extends Sequence1 implements Conjectural {

  private static final CR C = CR.THREE.sqrt().add(1);
  private static final int HEURISTIC = 1000;
  private long mN = -1;

  private boolean is(final long n) {
    Z m = Z.valueOf(n);
    for (long k = 0; k < HEURISTIC; ++k) {
      final Z t = C.multiply(m).floor();
      if (t.isEven()) {
        return false;
      }
      if (t.equals(m)) {
        return true;
      }
      m = t;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

