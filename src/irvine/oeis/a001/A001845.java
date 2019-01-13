package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001845.
 * @author Sean A. Irvine
 */
public class A001845 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z t = mN.multiply2();
    return t.add(1).multiply(mN.square().multiply2().add(t).add(3)).divide(3);
  }
}
