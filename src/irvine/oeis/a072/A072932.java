package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072932 a(n) is the least k such that floor( (1+1/k)^n ) = floor( (1+1/n)^k ).
 * @author Sean A. Irvine
 */
public class A072932 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Q t = new Q(++mN + 1, mN);
    Q s = Q.ONE;
    long k = 0;
    while (true) {
      final Z v = new Q(++k + 1, k).pow(mN).floor();
      s = s.multiply(t);
      if (s.floor().equals(v)) {
        return Z.valueOf(k);
      }
    }
  }
}

