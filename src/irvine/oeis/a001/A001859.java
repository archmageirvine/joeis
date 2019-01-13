package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001859.
 * @author Sean A. Irvine
 */
public class A001859 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z m = mN.add(1);
    return mN.multiply(m).divide2().add(m.square().shiftRight(2));
  }
}
