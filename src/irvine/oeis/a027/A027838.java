package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003319;

/**
 * A027838 Number of subgroups of index n in fundamental group of a certain fiber space.
 * @author Sean A. Irvine
 */
public class A027838 implements Sequence {

  private final MemorySequence mA = new A003319();
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      final int m = d.intValueExact();
      sum = sum.add(mA.a(m + 1).multiply(Z.valueOf(mN / m).pow(m + 1)));
    }
    return sum;
  }
}
