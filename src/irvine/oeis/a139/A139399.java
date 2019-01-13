package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A139399.
 * @author Sean A. Irvine
 */
public class A139399 implements Sequence {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z t = mN;
    while (t.compareTo(Z.FOUR) > 0 || Z.THREE.equals(t)) {
      t = t.isEven() ? t.divide2() : t.multiply(3).add(1);
      ++c;
    }
    return Z.valueOf(c);
  }
}
