package irvine.oeis.a050;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.a001.A001651;

/**
 * A050975 Haupt-exponents of 3 modulo integers relatively prime to 3.
 * @author Sean A. Irvine
 */
public class A050975 extends A001651 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return new IntegersModMul(super.next()).order(Z.THREE);
  }
}
