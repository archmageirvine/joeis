package irvine.oeis.a323;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a156.A156552;

/**
 * A323243 a(1) = 0; for n &gt; 1, a(n) = A000203(A156552(n)).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A323243 extends Sequence1 implements DirectSequence {

  private final DirectSequence mA156552 = new A156552();
  private long mN = 0;

  @Override
  public Z a(final Z n) {
    return Z.ONE.equals(n) ? Z.ZERO: Functions.SIGMA.z(1, mA156552.a(n));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
