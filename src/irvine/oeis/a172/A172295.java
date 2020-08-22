package irvine.oeis.a172;

import irvine.math.z.Z;
import irvine.oeis.a023.A023201;

/**
 * A172295 Partial sums of A023201.
 * @author Sean A. Irvine
 */
public class A172295 extends A023201 {

  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(super.next());
    return mS;
  }
}

