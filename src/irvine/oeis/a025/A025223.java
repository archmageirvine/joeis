package irvine.oeis.a025;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025223 [ Sum{(sqrt(j+1)-sqrt(i+1))^3} ], 1 &lt;= i &lt; j &lt;= n.
 * @author Sean A. Irvine
 */
public class A025223 extends Sequence1 {

  private long mN = 2;
  private CR mSum = CR.ZERO;

  @Override
  public Z next() {
    final CR s = CR.valueOf(Z.valueOf(++mN)).sqrt();
    for (long k = 2; k < mN; ++k) {
      final CR t = s.subtract(CR.valueOf(k).sqrt());
      mSum = mSum.add(ComputableReals.SINGLETON.pow(t, 3));
    }
    return mSum.floor();
  }
}
