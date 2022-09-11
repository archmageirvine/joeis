package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A095234 a(1) = 1, a(n) = n+a(n-1) if n does not divide a(n-1), else a(n) = n*a(n-1).
 * @author Georg Fischer
 */
public class A095234 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A095234() {
    super(1, 1, 0, 1);
  }

  @Override
  public Z compute(final int n) {
    return a(n - 1).remainder(Z.valueOf(n)).isZero() ? a(n - 1).multiply(n) : a(n - 1).add(n);
  }
}
