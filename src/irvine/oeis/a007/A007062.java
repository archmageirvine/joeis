package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A007062 Let P(n) of a sequence s(1),s(2),s(3),... be obtained by leaving s(1),...,s(n) fixed and reversing every n consecutive terms thereafter; apply P(2) to 1,2,3,... to get PS(2), then apply P(3) to PS(2) to get PS(3), then apply P(4) to PS(3), etc. This sequence is the limit of PS(n).
 * @author Sean A. Irvine
 */
public class A007062 extends MemoryFunction2Sequence<Integer, Integer> {

  /** Construct the sequence. */
  public A007062() {
    super(1);
  }

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
