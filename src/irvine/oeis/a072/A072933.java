package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072933 Numbers m such that the least k such that floor( (1+1/k)^m ) = floor( (1+1/m)^k ) is not equal to round(m*91/100).
 * @author Sean A. Irvine
 */
public class A072933 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Q t = new Q(++mN + 1, mN);
      final long r = new Q(91 * mN, 100).round().longValueExact();
      Q s = Q.ONE;
      long k = 0;
      while (true) {
        final Z v = new Q(++k + 1, k).pow(mN).floor();
        s = s.multiply(t);
        if (s.floor().equals(v)) {
          if (k != r) {
            return Z.valueOf(mN);
          } else {
            break;
          }
        }
      }
    }
  }
}

