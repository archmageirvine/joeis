package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065560 a(n) is the smallest integer k such that floor((1+1/n)^(k+1))/floor((1+1/n)^k) = 1+1/n.
 * @author Sean A. Irvine
 */
public class A065560 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Q f = new Q(++mN + 1, mN);
    Q fk = f.multiply(f);
    long k = 1;
    while (true) {
      ++k;
      final Q t = fk.multiply(f);
      if (new Q(t.toZ(), fk.toZ()).equals(f)) {
        return Z.valueOf(k);
      }
      fk = t;
    }
  }
}
