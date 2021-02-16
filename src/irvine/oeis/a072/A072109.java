package irvine.oeis.a072;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A072109 Numbers k such that Sum_{i=1..k} gcd(n,i) divides Sum_{i=1..k} lcm(k,i).
 * @author Sean A. Irvine
 */
public class A072109 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z l = Z.TWO;
      Q g = Q.ONE;
      for (final Z d : Cheetah.factor(mN).divisors()) {
        if (!Z.ONE.equals(d)) {
          final Z phi = Euler.phi(d);
          l = l.add(d.multiply(phi));
          g = g.add(new Q(phi, d));
        }
      }
      g = g.multiply(2);
      if (new Q(l, Z.ONE).divide(g).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
