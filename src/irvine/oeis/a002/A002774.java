package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a054.A054225;

/**
 * A002774.
 * @author Sean A. Irvine
 */
public class A002774 extends A054225 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z r = Z.SIX.pow(++mN);
    return get(r, r);
  }
}
