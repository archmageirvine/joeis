package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001621 a(n) = n*(n + 1)*(n^2 + n + 2)/4.
 * @author Sean A. Irvine
 */
public class A001621 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.square().add(mN + 2).multiply(mN + 1).multiply(n).shiftRight(2);
  }
}
