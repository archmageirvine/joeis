package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072323 Smallest Fibonacci number containing exactly n 0's.
 * @author Sean A. Irvine
 */
public class A072323 extends A072304 {

  /** Construct the sequence. */
  public A072323() {
    super(0);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
