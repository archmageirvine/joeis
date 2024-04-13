package irvine.oeis.a095;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A095197 a(1) = 1, a(n+1) = 2 * digit reversal of a(n).
 * @author Georg Fischer
 */
public class A095197 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A095197() {
    super(1, 1, 0, 1);
  }

  @Override
  public Z compute(final int n) {
    return Functions.REVERSE.z(a(n - 1)).multiply2();
  }
}
