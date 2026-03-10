package irvine.oeis.a390;
// manually 2026-03-07

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A390430 Least prime index of n plus greatest prime index of n; a(1) = 0.
 * @author Georg Fischer
 */
public class A390430 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    final Z[] f = Jaguar.factor(n).toZArray();
    return f.length == 0 ? Z.ZERO : Functions.PRIME_PI.z(f[0]).add(Functions.PRIME_PI.z(f[f.length - 1]));
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }

}
