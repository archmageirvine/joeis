package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a048.A048855;

/**
 * A055597 Powers of 2 in phi(n!).
 * @author Sean A. Irvine
 */
public class A055597 extends A048855 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}
