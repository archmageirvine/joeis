package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026614 a(n) least k &gt; a(n-1) such that a(k)=s(n), for n &gt;= 2, where s = A026600.
 * @author Sean A. Irvine
 */
public class A026614 extends A026600 {

  private int mN = -1;
  private int mM = -1;
  {
    super.next();
  }

  @Override
  public Z next() {
    if (mM == -1) {
      mM = 0;
      return Z.ONE;
    }
    final int n1 = ++mN;
    final Z target = a(n1);
    while (true) {
      super.next();
      final int n = ++mM;
      if (a(n).equals(target)) {
        return Z.valueOf(mM + 1);
      }
    }
  }
}
