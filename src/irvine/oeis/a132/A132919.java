package irvine.oeis.a132;
// Generated by gen_seq4.pl trisumm/trisimple at 2023-06-07 21:43

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A132919 Triangle read by rows: T(n,k) = Fibonacci(n) + k - 1.
 * @author Georg Fischer
 */
public class A132919 extends BaseTriangle {

  /** Construct the sequence. */
  public A132919() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Functions.FIBONACCI.z(n).add(k - 1);
  }
}
