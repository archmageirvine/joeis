package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a006.A006047;

/**
 * A062296 a(n) = number of entries in n-th row of Pascal's triangle divisible by 3.
 * @author Sean A. Irvine
 */
public class A062296 extends A006047 {

  @Override
  public Z next() {
    return super.next().negate().add(mN + 1);
  }
}

