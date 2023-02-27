package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A118334 a(n-1)*a(n-6) + a(n-2)*a(n-7) + a(n-3)*a(n-8) + a(n-4)*a(n-9), with a(k&lt;8) = 1.
 * @author Georg Fischer
 */
public class A118334 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A118334() {
    super(0, 9, 0, 1, 1, 1, 1, 1, 1, 1, 1, 4);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(a(n - 6))
      .add(a(n - 2).multiply(a(n - 7)))
      .add(a(n - 3).multiply(a(n - 8)))
      .add(a(n - 4).multiply(a(n - 9)));
  }
}