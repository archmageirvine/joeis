package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004083 Numbers n such that <code>cos(n-1) &lt;= 0</code> and <code>cos(n) &gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A004083 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR n1 = CR.valueOf(mN);
      final CR n = CR.valueOf(++mN);
      if (n1.cos().signum(-32) <= 0 && n.cos().signum(-32) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

