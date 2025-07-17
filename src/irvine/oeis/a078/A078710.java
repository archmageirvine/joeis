package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A078710 Integer part of the subinterval sample variance in the partition of [0,n] by the divisors of n.
 * @author Sean A. Irvine
 */
public class A078710 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z sx = Z.ZERO;
    Z t = Z.ZERO;
    long c = 0;
    final Z[] divs = Jaguar.factor(++mN).divisorsSorted();
    for (final Z d : divs) {
      final Z x = d.subtract(t);
      sx = sx.add(x);
      ++c;
      t = d;
    }
    final Q mean = new Q(sx, c);
    t = Z.ZERO;
    Q sx2 = Q.ZERO;
    for (final Z d : divs) {
      final Z x = d.subtract(t);
      sx2 = sx2.add(mean.subtract(x).square());
      t = d;
    }
    return sx2.divide(c - 1).floor();
  }
}
