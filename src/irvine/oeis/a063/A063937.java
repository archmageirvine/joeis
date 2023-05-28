package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063937 Sum of unitary divisors of n is a square &gt; 1.
 * @author Sean A. Irvine
 */
public class A063937 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = Jaguar.factor(++mN).unitarySigma();
      if (t.compareTo(Z.ONE) > 0 && t.isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
