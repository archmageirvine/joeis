package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005428 <code>a(n) = ceiling((1 +</code> sum of preceding terms) <code>/ 2)</code>.
 * @author Sean A. Irvine
 */
public class A005428 implements Sequence {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z t = Z.ONE.add(mSum.divide2());
    mSum = mSum.add(t);
    return t;
  }
}
