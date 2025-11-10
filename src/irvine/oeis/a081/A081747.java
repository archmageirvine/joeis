package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081747 a(n) = A081746(n) - n.
 * @author Sean A. Irvine
 */
public class A081747 extends A081746 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
