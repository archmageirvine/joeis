package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002522 <code>a(n) = n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A002522 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(1);
  }
}
