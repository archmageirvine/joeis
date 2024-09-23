package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072320 Smallest Fibonacci number containing exactly n 3's.
 * @author Sean A. Irvine
 */
public class A072320 extends A072304 {

  /** Construct the sequence. */
  public A072320() {
    super(3);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
