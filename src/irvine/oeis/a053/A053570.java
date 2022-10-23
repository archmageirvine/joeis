package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053570 Sum of totient functions over arguments running through reduced residue system of n.
 * @author Sean A. Irvine
 */
public class A053570 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Long> a = new TreeSet<>();
    for (long m = 1; m <= mN; ++m) {
      if (LongUtils.gcd(mN, m) == 1) {
        a.add(m);
      }
    }
    Z sum = Z.ZERO;
    for (final long v : a) {
      sum = sum.add(LongUtils.phi(v));
    }
    return sum;
  }
}
