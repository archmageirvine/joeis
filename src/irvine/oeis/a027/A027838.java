package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003319;
import irvine.oeis.memory.MemorySequence;

/**
 * A027838 Number of subgroups of index n in fundamental group of a certain fiber space.
 * @author Sean A. Irvine
 */
public class A027838 extends Sequence1 {

  private final MemorySequence mA = new A003319();
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final int m = d.intValueExact();
      sum = sum.add(mA.a(m + 1).multiply(Z.valueOf(mN / m).pow(m + 1)));
    }
    return sum;
  }
}
