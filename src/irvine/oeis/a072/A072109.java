package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072109 Numbers k such that Sum_{i=1..k} gcd(k,i) divides Sum_{i=1..k} lcm(k,i).
 * @author Sean A. Irvine
 */
public class A072109 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z l = Z.TWO;
      Q g = Q.ONE;
      for (final Z d : Jaguar.factor(mN).divisors()) {
        if (!Z.ONE.equals(d)) {
          final Z phi = Functions.PHI.z(d);
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
