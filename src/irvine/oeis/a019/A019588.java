package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019588 The right budding sequence: # of i such that <code>0&lt;i&lt;=n</code> and {tau*n} <code>&lt;=</code> {tau*i} <code>&lt; 1</code>, where <code>{}</code> is fractional part.
 * @author Sean A. Irvine
 */
public class A019588 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR nphi = CR.PHI.multiply(CR.valueOf(++mN));
    final CR frac = nphi.subtract(CR.valueOf(nphi.floor(32)));
    long c = 1;
    for (long k = 1; k < mN; ++k) {
      final CR u = CR.PHI.multiply(CR.valueOf(k));
      if (u.subtract(CR.valueOf(u.floor(32))).compareTo(frac) >= 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
