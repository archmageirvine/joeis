package irvine.oeis.a053;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053578 Values of cototient function for A053577.
 * @author Sean A. Irvine
 */
public class A053578 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long t = ++mN - Euler.phiAsLong(mN);
      if ((t & (t - 1)) == 0) {
        return Z.valueOf(t);
      }
    }
  }
}
