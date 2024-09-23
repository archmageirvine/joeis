package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072316 Smallest Fibonacci number containing exactly n 7's.
 * @author Sean A. Irvine
 */
public class A072316 extends A072304 {

  /** Construct the sequence. */
  public A072316() {
    super(7);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
