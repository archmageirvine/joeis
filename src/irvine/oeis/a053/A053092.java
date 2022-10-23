package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053092 2^A053087 kara n.
 * @author Sean A. Irvine
 */
public class A053092 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z t = Z.ONE;
    Z c;
    while ((c = A053087.kara(t, mN)) == null) {
      t = t.multiply2();
    }
    return c;
  }
}
