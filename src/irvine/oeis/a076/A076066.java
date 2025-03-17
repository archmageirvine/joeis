package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A076066 Sums of members of groups in A076063.
 * @author Sean A. Irvine
 */
public class A076066 extends A076063 {

  @Override
  public Z next() {
    step();
    return Functions.SUM.z(mA);
  }
}
