package irvine.oeis.a035;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.transform.DikTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A035083 DIK(b)-DIK[ 2 ](b)-b where b is A035082.
 * @author Sean A. Irvine
 */
public class A035083 extends A035082 {

  @Override
  public Z next() {
    final Z t = super.next();
    final int n = mA.size();
    if (n <= 3) {
      return Z.ZERO;
    }
    final Sequence dik = new SkipSequence(new DikTransformSequence(new FiniteSequence(mA), 1), n - 1);
    final Polynomial<Z> d2 = RING.add(RING.pow(mA, 2, n), mA.substitutePower(2, n));
    return dik.next().subtract(d2.coeff(n - 1).divide2()).subtract(t);
  }
}
