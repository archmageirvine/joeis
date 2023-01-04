package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a020.A020652;
import irvine.oeis.a020.A020653;

/**
 * A060837 List the positive rationals in the canonical order A020652(n)/A020653(n) and apply the Sagher map to turn them into integers.
 * @author Sean A. Irvine
 */
public class A060837 extends Sequence1 {

  private final Sequence mNum = new A020652();
  private final Sequence mDen = new A020653();

  @Override
  public Z next() {
    Z res = Z.ONE;
    final FactorSequence num = Jaguar.factor(mNum.next());
    for (final Z p : num.toZArray()) {
      res = res.multiply(p.pow(2L * num.getExponent(p)));
    }
    final FactorSequence den = Jaguar.factor(mDen.next());
    for (final Z p : den.toZArray()) {
      res = res.multiply(p.pow(2L * den.getExponent(p) - 1));
    }
    return res;
  }
}
