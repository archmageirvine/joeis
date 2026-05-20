package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a025.A025429;

/**
 * A084888 Number of partitions of n^3 into two squares&gt;0.
 * @author Sean A. Irvine
 */
public class A084888 extends A025429 {

  private long mN = -1;

  @Override
  public Z next() {
    final long n3 = ++mN * mN * mN;
    return get(n3, Functions.SQRT.i(n3), 2);
  }
}
