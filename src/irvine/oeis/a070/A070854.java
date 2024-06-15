package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070854 extends Sequence1 {

  private Z mM = Z.ONE;

  @Override
  public Z next() {
    mM = mM.multiply(10);
    Z t = mM.add(1);
    while (!t.isProbablePrime()) {
      t = t.add(mM);
    }
    return t;
  }
}
