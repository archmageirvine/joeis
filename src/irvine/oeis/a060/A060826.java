package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a025.A025487;

/**
 * A060826 a(n) is the largest number such that 3^a(n) [also 6^a(n)] divides A025487(n) (least prime signatures).
 * @author Sean A. Irvine
 */
public class A060826 extends A025487 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.valuation(super.next(), Z.THREE));
  }
}
