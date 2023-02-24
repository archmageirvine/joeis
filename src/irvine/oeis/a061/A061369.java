package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061369 a(n) = smallest square in the arithmetic progression {nk+1 : k &gt; 0}.
 * @author Sean A. Irvine
 */
public class A061369 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z t = mN.multiply(++k).add(1);
      if (t.isSquare()) {
        return t;
      }
    }
  }
}

