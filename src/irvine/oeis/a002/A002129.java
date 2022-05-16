package irvine.oeis.a002;

import java.io.Serializable;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002129 Generalized sum of divisors function: excess of sum of odd divisors of n over sum of even divisors of n.
 * @author Sean A. Irvine
 */
public class A002129 implements Sequence, Serializable {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      s = s.signedAdd(d.isOdd(), d);
    }
    return s;
  }
}
