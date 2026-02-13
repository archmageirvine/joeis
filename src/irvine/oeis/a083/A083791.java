package irvine.oeis.a083;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;

/**
 * A083791 Prime signatures pertaining to A083788.
 * @author Sean A. Irvine
 */
public class A083791 extends A083788 {

  @Override
  public Z next() {
    return FactorUtils.leastPrimeSignature(super.next());
  }
}
