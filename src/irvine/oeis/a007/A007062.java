package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007062 Let P(n) of a sequence s(1),s(2),s(3),... be obtained by leaving s(1),...,s(n) fixed and reversing every n consecutive terms thereafter; apply P(2) to 1,2,3,... to get PS(2), then apply P(3) to PS(2) to get PS(3), then apply P(4) to PS(3), etc. The limit of PS(n) is A007062.
 * @author Sean A. Irvine
 */
public class A007062 extends MemoryFunction2<Integer, Integer> implements Sequence {

  @Override
  protected Integer compute(final Integer n, final Integer m) {
    if (n == 0) {
      return m;
    }
    return get(n - 1, n * (m / n) + n - m % n);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 0) + 1);
  }
}
