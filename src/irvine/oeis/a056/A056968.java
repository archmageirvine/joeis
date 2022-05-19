package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056968 10^(n-1) modulo n.
 * @author Sean A. Irvine
 */
public class A056968 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z m = mN;
    mN = mN.add(1);
    return Z.TEN.modPow(m, mN);
  }
}
