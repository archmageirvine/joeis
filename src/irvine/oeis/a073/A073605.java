package irvine.oeis.a073;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A073605 Smallest number m such that m + k == 0 mod k-th prime for all k from 1 to n.
 * @author Sean A. Irvine
 */
public class A073605 extends A000040 {

  private final List<Z> mPrimes = new ArrayList<>();

  @Override
  public Z next() {
    mPrimes.add(super.next());
    final Z[] a = new Z[mPrimes.size()];
    for (int k = 0; k < a.length; ++k) {
      a[k] = Z.valueOf(-k);
    }
    return ZUtils.chineseRemainderTheorem(a, mPrimes.toArray(new Z[0])).subtract(1).abs();
  }
}
