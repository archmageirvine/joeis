package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034178 Number of solutions to n = a^2 - b^2, a &gt; b &gt;= 0.
 * @author Sean A. Irvine
 */
public class A034178 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    switch ((int) (++mN & 3)) {
      case 0:
        return Jaguar.factor(mN / 4).sigma0().add(1).divide2();
      case 1:
      case 3:
        return Jaguar.factor(mN).sigma0().add(1).divide2();
      default:
        return Z.ZERO;
    }
  }
}
