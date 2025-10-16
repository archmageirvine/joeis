package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a066.A066328;

/**
 * A066328.
 * @author Sean A. Irvine
 */
public class A386280 extends A066328 {

  private long mN = 1;
  {
    super.next(); // skip n=1 for which Omega(1)=0
  }

  @Override
  public Z next() {
    while (true) {
      if (new Q(super.next(), Functions.BIG_OMEGA.z(++mN)).den().equals(Z.TWO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
