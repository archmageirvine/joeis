package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002212;
import irvine.oeis.memory.MemorySequence;

/**
 * A038380 Number of perifusenes with one internal vertex.
 * @author Sean A. Irvine
 */
public class A038380 extends Sequence0 {

  private static final Z[] SMALL = {Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE};
  private final MemorySequence mU = MemorySequence.cachedSequence(new A002212());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return SMALL[mN];
    }
    final int a = mN - 3;
    Z sum = mU.a(a);
    if ((a & 1) == 0) {
      final Z u = mU.a(a / 2);
      sum = sum.add(u).subtract(u.square().multiply2());
    }
    if (a % 3 == 0) {
      final Z u = mU.a(a / 3);
      sum = sum.add(u.subtract(u.pow(3).multiply(4)).multiply2().divide(3));
    }
    for (int i = 1; i <= a / 2; ++i) {
      sum = sum.add(mU.a(i).multiply(mU.a(a - i)).multiply(4));
    }
    for (int i = 1; i <= a / 3; ++i) {
      Z t = Z.ZERO;
      for (int j = i; j <= (a - i) / 2; ++j) {
        t = t.add(mU.a(j).multiply(mU.a(a - i - j)));
      }
      sum = sum.add(t.multiply(mU.a(i)).multiply(8));
    }
    for (int i = 1; i <= (a - 1) / 2; ++i) {
      sum = sum.subtract(mU.a(i).square().multiply(mU.a(a - 2 * i)).multiply(4));
    }
    return sum;
  }
}
