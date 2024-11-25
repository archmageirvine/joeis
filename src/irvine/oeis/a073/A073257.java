package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073257 Smallest k such that gcd(c(k),k) = gcd(A002808(k),k) = A064814(k) = n.
 * @author Sean A. Irvine
 */
public class A073257 extends Sequence1 {

  private final Sequence mC = new A002808();
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long g = Functions.GCD.l(mC.next(), ++mM);
      if (mFirsts.get(g) == 0) {
        mFirsts.set(g, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

