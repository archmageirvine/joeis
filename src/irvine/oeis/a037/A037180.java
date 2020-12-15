package irvine.oeis.a037;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A037180 Number of different cycle lengths when squaring modulo n-th prime.
 * @author Sean A. Irvine
 */
public class A037180 extends A000040 {

  @Override
  public Z next() {
    final Z[] div = Cheetah.factor(super.next().subtract(1).makeOdd()).divisorsSorted();
    final Z rho = div[div.length - 1];
    final TreeSet<Z> seen = new TreeSet<>();
    for (final Z d : Cheetah.factor(rho).divisors()) {
      seen.add(Z.ONE.equals(d) ? Z.ONE : new IntegersModMul(d).order(Z.TWO));
    }
    return Z.valueOf(seen.size());
  }
}
