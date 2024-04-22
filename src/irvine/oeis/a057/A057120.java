package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A057120 Global ranks of terms of A057119.
 * @author Sean A. Irvine
 */
public class A057120 extends A057119 {

  static Z catalanGlobalRank(final Z a) {
    final int n = a.bitLength() / 2;
    return Integers.SINGLETON.sum(0, n - 1, Functions.CATALAN::z).add(A057121.catalanRank(n, a));
  }

  @Override
  public Z next() {
    return catalanGlobalRank(super.next());
  }
}
