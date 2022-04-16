package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a030.A030664;

/**
 * A056139 a(n) = n^2 - primefloor(n)*primeceiling(n).
 * @author Sean A. Irvine
 */
public class A056139 extends A030664 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mN + 1).square().subtract(super.next());
  }
}
