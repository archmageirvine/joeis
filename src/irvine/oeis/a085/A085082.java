package irvine.oeis.a085;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085082 Number of distinct prime signatures arising among the divisors of n.
 * @author Sean A. Irvine
 */
public class A085082 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final HashSet<Z> sigs = new HashSet<>();
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sigs.add(FactorUtils.leastPrimeSignature(d));
    }
    return Z.valueOf(sigs.size());
  }
}
