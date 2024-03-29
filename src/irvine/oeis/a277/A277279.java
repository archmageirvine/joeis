package irvine.oeis.a277;
// Generated by gen_seq4.pl somos4 at 2022-06-02 21:40

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A277279 Somos-4 sequence variant: a(n) = (a(n-1) * a(n-3) - a(n-2)^2) / a(n-4), a(0) = 1, a(1) = 1, a(2) = 2, a(3) = -1.
 * @author Georg Fischer
 */
public class A277279 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A277279() {
    super(0, 4, 0, 1, 1, 2, -1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(a(n - 3)).add(a(n - 2).square().multiply(-1)).divide(a(n - 4));
  }
}
