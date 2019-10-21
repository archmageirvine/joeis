package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a027.A027960;

/**
 * A026998 Triangular array T read by rows: <code>T(n,k)=t(n,2k)</code>, t given by <code>A027960, 0&lt;=k&lt;=n, n &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A026998 extends A027960 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, 2 * mM);
  }
}
