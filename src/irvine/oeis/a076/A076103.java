package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A076029 Products of members of groups in A076031.
 * @author Sean A. Irvine
 */
public class A076103 extends A076105 {

  @Override
  public Z next() {
    step();
    return Functions.SUM.z(mA);
  }
}
