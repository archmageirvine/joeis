package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A057427 a(n) = 1 if n &gt; 0, a(n) = 0 if n = 0; series expansion of x/(1-x).
 * Also cellular 1D automaton, rule 175.
 * @author Georg Fischer
 */
public class A057427 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : Z.ONE;
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : Z.ONE;
  }

  @Override
  public Z a(final int n) {
    return (n == 0) ? Z.ZERO : Z.ONE;
  }

}
