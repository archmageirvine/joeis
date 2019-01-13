package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002492.
 * @author Sean A. Irvine
 */
public class A002492 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z t = mN.multiply2();
    return t.multiply(mN.add(1)).multiply(t.add(1)).divide(3);
  }
}
