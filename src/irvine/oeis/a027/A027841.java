package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;

/**
 * A027841 Number of subgroups of index n in fundamental group of a certain fiber space.
 * @author Sean A. Irvine
 */
public class A027841 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A027840());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final int m = d.intValueExact();
      sum = sum.add(mA.a(m - 1).multiply(Z.valueOf(mN / m).pow(2L * m + 2)));
    }
    return sum;
  }
}
