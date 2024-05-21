package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069751 Smallest k&gt;n such that floor((11/10)^k)/floor((11/10)^n) is an integer.
 * @author Sean A. Irvine
 */
public class A069751 extends Sequence1 {

  private static final Q C = new Q(11, 10);
  private int mN = 0;

  @Override
  public Z next() {
    final Q d = C.pow(++mN);
    final Z f = d.floor();
    long k = mN;
    Q c = d;
    while (true) {
      c = c.multiply(C);
      ++k;
      if (c.floor().mod(f).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
