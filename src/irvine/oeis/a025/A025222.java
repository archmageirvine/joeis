package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025222 a(n) = [ Sum{(sqrt(j+1)-sqrt(i+1))^2} ], 1 &lt;= i &lt; j &lt;= n.
 * @author Sean A. Irvine
 */
public class A025222 implements Sequence {

  private long mN = 2;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final CR s = CR.valueOf(Z.valueOf(++mN)).sqrt();
    for (long k = 2; k < mN; ++k) {
      final CR t = s.subtract(CR.valueOf(k).sqrt());
      mSum = mSum.add(t.multiply(t));
    }
    return mSum.floor();
  }
}
