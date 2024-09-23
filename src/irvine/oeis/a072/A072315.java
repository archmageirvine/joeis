package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072315 Smallest Fibonacci number containing exactly n 8's.
 * @author Sean A. Irvine
 */
public class A072315 extends A072304 {

  /** Construct the sequence. */
  public A072315() {
    super(8);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
