package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A060615 Number of conjugacy classes in the group GL_2(K) when K is a finite field with q = p^m for a prime p and m &gt;= 1.
 * @author Sean A. Irvine
 */
public class A060615 extends A000961 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    return super.next().square().subtract(1);
  }
}
