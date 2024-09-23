package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072321 Smallest Fibonacci number containing exactly n 2's.
 * @author Sean A. Irvine
 */
public class A072321 extends A072304 {

  /** Construct the sequence. */
  public A072321() {
    super(2);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
