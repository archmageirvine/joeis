package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007706 <code>a(n) = 1 +</code> coefficient of <code>x^n</code> in Product_{k&gt;=1} <code>(1-x^k)</code> (essentially the expansion of the Dedekind function eta(x)).
 * @author Sean A. Irvine
 */
public class A007706 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.eta(RING.x(), ++mN).coeff(mN).add(1);
  }
}
