package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061780 Number of solutions to x + y + z = 0 mod (2n+1) such that x,y,z are units modulo 2n+1, i.e., gcd(x, 2n+1) = gcd(y, 2n+1) = gcd(z, 2n+1) = 1.
 * @author Sean A. Irvine
 */
public class A061780 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    Q prod = new Q(Z.valueOf(mN).square());
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      prod = prod.multiply(Q.ONE.subtract(new Q(Z.THREE, p)).add(new Q(Z.TWO, p.square())));
    }
    return prod.toZ();
  }
}

