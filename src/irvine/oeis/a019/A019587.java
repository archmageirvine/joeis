package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019587 The left budding sequence: number of i such that 0 &lt; i &lt;= n and 0 &lt; {phi*i} &lt;= {phi*n}, where {} denotes the fractional part and phi = A001622.
 * @author Sean A. Irvine
 */
public class A019587 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR nphi = CR.PHI.multiply(++mN);
    final CR frac = nphi.subtract(CR.valueOf(nphi.floor()));
    long c = 1;
    for (long k = 1; k < mN; ++k) {
      final CR u = CR.PHI.multiply(k);
      if (u.subtract(CR.valueOf(u.floor())).compareTo(frac) <= 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
