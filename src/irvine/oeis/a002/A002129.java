package irvine.oeis.a002;

import java.io.Serializable;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A002129 Generalized sum of divisors function: excess of sum of odd divisors of n over sum of even divisors of n.
 * @author Sean A. Irvine
 */
public class A002129 extends Sequence1 implements Serializable, DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      s = s.signedAdd(d.isOdd(), d);
    }
    return s;
  }

  @Override
  public Z a(final int n) {
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      s = s.signedAdd(d.isOdd(), d);
    }
    return s;
  }

}
