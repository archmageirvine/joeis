package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061556 a(n) is the least k &gt; 0 such that sigma(k!) &gt;= n*k!.
 * @author Sean A. Irvine
 */
public class A061556 extends A061555 {

  private long mN = -1;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    while (true) {
      ++mM;
      if (mN == super.next().longValueExact()) {
        return Z.valueOf(mM);
      }
    }
  }
}
