package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a051.A051248;

/**
 * A070327 Smallest nontrivial power of n starting with n and greater than n.
 * @author Sean A. Irvine
 */
public class A070327 extends Sequence2 {

  private Z mN = Z.ONE;
  private final Sequence mA = new A051248().skip();

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(mA.next());
  }
}
