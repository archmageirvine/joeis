package irvine.oeis.a109;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;


/**
 * A109867 a(1) = 12; for n &gt;= 1, a(n+1) = abs((a(n) + R(a(n))) * (a(n) - R(a(n)))), where R(k) is the digit reversal of k.
 * @author Georg Fischer
 */
public class A109867 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A109867() {
    super(1, 1, 0, 12);
  }

  @Override
  public Z compute(final int n) {
    return Functions.REVERSE.z(a(n - 1)).add(a(n - 1)).multiply(a(n - 1).subtract(Functions.REVERSE.z(a(n - 1)))).abs();
  }
}
