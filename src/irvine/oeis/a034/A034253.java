package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a076.A076832;

/**
 * A034253 Triangle read by rows: <code>T(n,k) =</code> number of inequivalent linear <code>[n,k]</code> binary codes without 0 columns <code>(n &gt;= 1, 1 &lt;= k &lt;= n)</code>.
 * @author Sean A. Irvine
 */
public class A034253 extends A076832 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM).subtract(t(mN, mM - 1));
  }
}

