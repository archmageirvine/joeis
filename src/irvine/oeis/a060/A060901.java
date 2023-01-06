package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A060901 Exact power of 3 that divides the n-th Fibonacci number (sequence A000045).
 * @author Sean A. Irvine
 */
public class A060901 extends A000045 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.THREE.pow(ZUtils.valuation(super.next(), Z.THREE));
  }
}
