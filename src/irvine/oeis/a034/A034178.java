package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034178 Number of solutions to n = a^2 - b^2, a &gt; b &gt;= 0.
 * @author Sean A. Irvine
 */
public class A034178 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    switch ((int) (++mN & 3)) {
      case 0:
        return Functions.SIGMA0.z(mN / 4).add(1).divide2();
      case 1:
      case 3:
        return Functions.SIGMA0.z(mN).add(1).divide2();
      default:
        return Z.ZERO;
    }
  }
}
