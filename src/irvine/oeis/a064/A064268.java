package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A064268 a(n) = (a(n-1) * a(n-6) + 2 * a(n-3) * a(n-4)) / a(n-7). a(1) = ... = a(7) = 1. Somos-7 variation.
 * @author Georg Fischer
 */
public class A064268 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A064268() {
    super(1, 7, 0, 1, 1, 1, 1, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(a(n - 6)).add(a(n - 3).multiply(a(n - 4)).multiply2()).divide(a(n - 7));
  }
}
