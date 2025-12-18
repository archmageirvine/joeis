package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A082637 a(n) = smallest number which can be expressed as sum of d consecutive positive integers in exactly n ways (where d&gt;0 is a divisor of the number).
 * @author Sean A. Irvine
 */
public class A082637 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      int count = 0;
      for (final Z d : Jaguar.factor(mM).divisors()) {
        final long dd = d.longValue();
        if (d.multiply(d.add(1)).compareTo(2 * mM) <= 0) {
          if ((dd & 1) == 1 && mM % dd == 0) {
            ++count;
          }
        }
      }
      if (mFirsts.get(count) == 0) {
        mFirsts.set(count, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
