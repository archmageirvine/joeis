package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a025.A025487;

/**
 * A051282.
 * @author Sean A. Irvine
 */
public class A051282 extends A025487 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}
