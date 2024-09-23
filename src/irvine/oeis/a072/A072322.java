package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072322 Smallest Fibonacci number containing exactly n 1's.
 * @author Sean A. Irvine
 */
public class A072322 extends A072304 {

  /** Construct the sequence. */
  public A072322() {
    super(1);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
