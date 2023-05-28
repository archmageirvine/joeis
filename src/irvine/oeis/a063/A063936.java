package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063936 Numbers k such that the sum of unitary proper divisors of k is a square &gt; 1.
 * @author Sean A. Irvine
 */
public class A063936 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final Z t = Jaguar.factor(++mN).unitarySigma().subtract(mN);
      if (t.compareTo(Z.ONE) > 0 && t.isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
