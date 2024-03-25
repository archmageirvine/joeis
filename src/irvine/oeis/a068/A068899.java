package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A068899 Triangular numbers containing 2n digits obtained by duplicating the first n digits; i.e., triangular numbers in A020338.
 * @author Sean A. Irvine
 */
public class A068899 extends Sequence1 {

  // After Robert Israel

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mN;
      final Z lim = Z.TEN.pow(mN - 1);
      final Z f = lim.multiply(10).add(1);
      final FactorSequence fs = Jaguar.factor(f);
      for (final Z d : fs.divisors()) {
        final Z fd = f.divide(d);
        if (d.gcd(fd).equals(Z.ONE)) {
          for (int e = 1; e <= 3; e += 2) {
            final Z u = ZUtils.chineseRemainderTheorem(new Z[] {Z.ONE, Z.NEG_ONE, Z.valueOf(e)}, new Z[] {d, fd, Z.FOUR});
            final Z y = u.square().subtract(1).divide(8).divide(f);
            if (y.compareTo(lim) >= 0 && y.compareTo(f) <= 0) {
              mA.add(y.multiply(f));
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
