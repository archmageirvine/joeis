package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036694 a(n) = (1/4)*A036693(n) for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A036694 extends A036693 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
