package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A027839.
 * @author Sean A. Irvine
 */
public class A027839 implements Sequence {

  private final MemorySequence mA = new A027837();
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      final int m = d.intValueExact();
      sum = sum.add(mA.a(m).multiply(Z.valueOf(mN / m).pow(2 * m + 1)));
    }
    return sum;
  }
}
