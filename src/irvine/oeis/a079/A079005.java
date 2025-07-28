package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008297;

/**
 * A079005 Exponential transform of unsigned Lah-triangle |A008297(n,k)|.
 * @author Sean A. Irvine
 */
public class A079005 extends A008297 {

  @Override
  public Z next() {
    return super.next().abs().multiply(Functions.BELL.z(mM));
  }
}
