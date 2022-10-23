package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030001 Smallest power of 2 whose decimal expansion contains n.
 * @author Sean A. Irvine
 */
public class A030001 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final String s = mN.toString();
    Z t = Z.ONE;
    while (!t.toString().contains(s)) {
      t = t.multiply2();
    }
    return t;
  }
}
