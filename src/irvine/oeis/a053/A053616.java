package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A053616 Pyramidal sequence: distance to nearest triangular number.
 * @author Sean A. Irvine
 */
public class A053616 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    final Z m = n.multiply2();
    final Z s = Functions.SQRT.z(m);
    return n.subtract(Functions.TRIANGULAR.z(s)).min(Functions.TRIANGULAR.z(s.add(1)).subtract(n)).abs();
  }

  @Override
  public Z a(final long n) {
    final long m = 2 * n;
    final long s = Functions.SQRT.l(m);
    return Z.valueOf(Math.abs(Math.min(n - Functions.TRIANGULAR.l(s), Functions.TRIANGULAR.l(s + 1) - n)));
  }
}
