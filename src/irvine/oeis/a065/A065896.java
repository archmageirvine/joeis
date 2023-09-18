package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065896 Number of composites &lt;= 2*n.
 * @author Sean A. Irvine
 */
public class A065896 extends A002808 {

  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 4) {
      return Z.valueOf(mN - 1);
    }
    final Z s = Z.valueOf(2 * mN);
    while (true) {
      ++mM;
      if (s.equals(super.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}
