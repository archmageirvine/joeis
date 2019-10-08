package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026614 <code>a(n)</code> least k <code>&gt; a(n-1)</code> such that <code>a(k)=s(n)</code>, for <code>n &gt;= 2</code>, where s <code>= A026600</code>.
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
    final Z target = get(++mN);
    while (true) {
      super.next();
      if (get(++mM).equals(target)) {
        return Z.valueOf(mM + 1);
      }
    }
  }
}
