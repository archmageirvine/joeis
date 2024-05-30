package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005040 Number of nonequivalent dissections of a polygon into n pentagons by nonintersecting diagonals up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A005040 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Q a = new Q(Binomial.binomial(4L * mN , mN), Z.valueOf(3L * mN + 1).multiply(3L * mN + 2));
    if ((mN & 1) == 1) {
      a = a.add(new Q(Binomial.binomial(2L * mN, (mN - 1) / 2), Z.valueOf(mN)));
    } else {
      a = a.add(new Q(Binomial.binomial(4L * mN / 2, mN / 2), Z.valueOf(3L * mN + 2)).multiply(3));
    }
    final long d = Functions.GCD.l(5, mN - 1);
    for (final Z s : Jaguar.factor(d).divisors()) {
      final long ss = s.longValueExact();
      if (ss > 2) {
        a = a.add(new Q(Binomial.binomial((4L * mN + 1) / ss, (mN - 1) / ss), Z.valueOf(4L * mN + 1)).multiply(Functions.PHI.l(ss)));
      }
    }
    return a.toZ().divide2();
  }
}
