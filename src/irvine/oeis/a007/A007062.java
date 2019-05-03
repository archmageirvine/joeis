package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007062 Let <code>P(n)</code> of a sequence <code>s(1),s(2),s(3),..</code>. be obtained by leaving <code>s(1),...,s(n)</code> fixed and reversing every n consecutive terms thereafter; apply <code>P(2)</code> to 1,2,3,... to get <code>PS(2)</code>, then apply <code>P(3)</code> to <code>PS(2)</code> to get <code>PS(3)</code>, then apply <code>P(4)</code> to <code>PS(3)</code>, etc. The limit of <code>PS(n)</code> is <code>A007062</code>.
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
