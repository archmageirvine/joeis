package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072318 Smallest Fibonacci number containing exactly n 5's.
 * @author Sean A. Irvine
 */
public class A072318 extends A072304 {

  /** Construct the sequence. */
  public A072318() {
    super(5);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
