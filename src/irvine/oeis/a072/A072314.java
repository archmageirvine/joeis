package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072314 Smallest Fibonacci number containing exactly n 9's.
 * @author Sean A. Irvine
 */
public class A072314 extends A072304 {

  /** Construct the sequence. */
  public A072314() {
    super(9);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
