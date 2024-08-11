package irvine.oeis.a071;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071158 Factorial expansion of A071156.
 * @author Sean A. Irvine
 */
public class A071158 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    Z m = Z.ONE;
    while (m.compareTo(res) <= 0) {
      m = m.multiply(10);
    }
    final long r = Functions.LEADING_DIGIT.l(res);
    for (long k = 1; k <= r + 1; ++k) {
      mA.add(res.add(m.multiply(k)));
    }
    return res;
  }
}
