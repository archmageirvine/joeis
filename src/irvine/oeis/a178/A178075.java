package irvine.oeis.a178;
// Generated by gen_seq4.pl somos4 at 2022-06-02 21:40

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A178075 A (1,2) Somos-4 sequence.
 * @author Georg Fischer
 */
public class A178075 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A178075() {
    super(0, 4, 0, 0, 1, 1, -2, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(a(n - 3)).add(a(n - 2).square().multiply(2)).divide(a(n - 4));
  }
}
