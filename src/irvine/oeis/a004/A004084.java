package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004084 <code>a(n) =</code> n-th positive integer k such that tan(k-1) <code>&lt;= 0</code> and tan(k) <code>&gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A004084 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR n1 = CR.valueOf(mN);
      final CR n = CR.valueOf(++mN);
      if (ComputableReals.SINGLETON.tan(n1).signum(-32) <= 0 && ComputableReals.SINGLETON.tan(n).signum(-32) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

