package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027007 <code>T(2n+1,n+4)</code>, T given by <code>A026998</code>.
 * @author Sean A. Irvine
 */
public class A027007 extends A027960 {

  private long mN = 5;

  @Override
  public Z next() {
    mN += 2;
    return get(mN, mN + 7);
  }
}
