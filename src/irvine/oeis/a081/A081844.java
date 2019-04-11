package irvine.oeis.a081;

import irvine.factor.factor.Cheetah;
import irvine.math.group.IntegersMod;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081844 Number of irreducible factors of <code>x^(2n+1) - 1</code> over GF(2).
 * @author Sean A. Irvine
 */
public class A081844 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      sum = sum.add(Euler.phi(d).divide(new IntegersMod(d).ord(Z.TWO.mod(d))));
    }
    return sum;
  }
}
