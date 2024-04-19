package irvine.oeis.a122;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A122670 If n mod 4 = 2 or n mod 4 = 3 then a(n) = 0 else let m=floor(n/4), then a(n) = (2*m)!/m!.
 * @author Sean A. Irvine
 */
public class A122670 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int t = mN & 3;
    if (t == 2 || t == 3) {
      return Z.ZERO;
    }
    final int m = mN >>> 2;
    return Functions.FACTORIAL.z(2 * m).divide(Functions.FACTORIAL.z(m));
  }
}

