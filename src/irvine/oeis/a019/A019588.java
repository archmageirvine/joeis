package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019588 The right budding sequence: # of i such that <code>0&lt;i&lt;=n</code> and <code>{tau*n} &lt;= {tau*i} &lt; 1</code>, where <code>{}</code> is fractional part.
 * @author Sean A. Irvine
 */
public class A019588 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR nphi = CR.PHI.multiply(++mN);
    final CR frac = nphi.subtract(CR.valueOf(nphi.floor()));
    long c = 1;
    for (long k = 1; k < mN; ++k) {
      final CR u = CR.PHI.multiply(k);
      if (u.subtract(CR.valueOf(u.floor())).compareTo(frac) >= 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
