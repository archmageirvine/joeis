package irvine.oeis.a184;
// Generated by gen_seq4.pl somos4 at 2022-06-02 21:40

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A184121 A (4,-3) Somos-4 sequence.
 * @author Georg Fischer
 */
public class A184121 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A184121() {
    super(0, 4, 0, 1, -1, -7, -31);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(a(n - 3)).multiply(4).add(a(n - 2).square().multiply(-3)).divide(a(n - 4));
  }
}
