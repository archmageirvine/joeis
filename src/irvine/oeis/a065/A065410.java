package irvine.oeis.a065;
// manually cordrec at 2022-06-08 21:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A065410 a(n) = n*(a(n-1))^2 + 2
 * @author Georg Fischer
 */
public class A065410 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A065410() {
    super(0, 1, 0, 2);
  }

  @Override
  protected Z compute(final int n) {
    return Z.valueOf(2).add((a(n - 1)).square().multiply(n));
  }
}
