package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A076060 Sums of members of groups in A076062.
 * @author Sean A. Irvine
 */
public class A076060 extends A076062 {

  @Override
  public Z next() {
    step();
    return Functions.SUM.z(mA);
  }
}
