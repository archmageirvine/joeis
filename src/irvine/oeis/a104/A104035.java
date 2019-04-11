package irvine.oeis.a104;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A104035 Triangle T(n,k), <code>0&lt;=k&lt;=n,</code> read by rows, defined by T(0,0) <code>= 1</code>; T(0,k) <code>= 0</code> if <code>k&gt;0</code> or if <code>k&lt;0</code>; T(n,k) = k*T(n-1,k-1) + (k+1)*T(n-1,k+1).
 * @author Sean A. Irvine
 */
public class A104035 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 0, 1);
  private Polynomial<Z> mQ = RING.one();
  private int mN = -1;

  private void step() {
    mQ = RING.add(RING.multiply(RING.diff(mQ), C), mQ.shift(1));
  }

  @Override
  public Z next() {
    if (++mN > mQ.degree()) {
      mN = 0;
      step();
    }
    return mQ.coeff(mN);
  }

}
