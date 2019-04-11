package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019446 <code>a(n) =</code> ceiling(n/tau), where tau <code>= (1+sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A019446 extends A019445 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
