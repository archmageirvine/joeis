package irvine.oeis.a076;

import java.util.HashSet;

import irvine.math.z.Z;

/**
 * A076222 Number of different values in n-th row of A076221.
 * @author Sean A. Irvine
 */
public class A076222 extends A076221 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Z> set = new HashSet<>();
    for (long k = 0; k < mN; ++k) {
      set.add(super.next());
    }
    return Z.valueOf(set.size());
  }
}
