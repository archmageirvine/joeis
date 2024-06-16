package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049345 n written in primorial base.
 * @author Sean A. Irvine
 */
public class A049345 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.PRIMORIAL_BASE.z(++mN);
  }
}
