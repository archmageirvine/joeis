package irvine.oeis.a183;
// manually sumdiv3/sumdiv at 2023-04-11 13:56

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A183098 a(1) = 0, a(n) = sum of divisors d of n such that if d = Product_(i) (p_i^e_i) then all e_i are &lt;= 1.
 * @author Georg Fischer
 */
public class A183098 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A183098() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> (d > 1 && Jaguar.factor(d).minExponent() < 2) ? Z.valueOf(d) : Z.ZERO);
  }
}
