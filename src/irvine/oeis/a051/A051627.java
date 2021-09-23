package irvine.oeis.a051;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.a040.A040017;

/**
 * A051627 Periods associated with A040017.
 * @author Sean A. Irvine
 */
public class A051627 extends A040017 {

  @Override
  public Z next() {
    return new IntegersModMul(super.next()).order(Z.TEN);
  }
}
