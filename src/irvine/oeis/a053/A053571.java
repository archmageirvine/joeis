package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053571 Sum of totient functions over arguments running through numbers unrelated to n.
 * @author Sean A. Irvine
 */
public class A053571 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Long> a = new TreeSet<>();
    for (long m = 1; m <= mN; ++m) {
      if (Functions.GCD.l(mN, m) > 1 && mN % m != 0) {
        a.add(m);
      }
    }
    Z sum = Z.ZERO;
    for (final long v : a) {
      sum = sum.add(Functions.PHI.l(v));
    }
    return sum;
  }
}
