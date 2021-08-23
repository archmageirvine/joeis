package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a001.A001601;

/**
 * A051009 Reduced denominators of Newton's iteration for sqrt(2).
 * @author Sean A. Irvine
 */
public class A051009 extends A001601 {

  @Override
  public Z next() {
    return super.next().square().subtract(1).divide2().sqrt().max(Z.ONE);
  }
}
