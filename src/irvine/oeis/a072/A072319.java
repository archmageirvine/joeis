package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072319 Smallest Fibonacci number containing exactly n 4's.
 * @author Sean A. Irvine
 */
public class A072319 extends A072304 {

  /** Construct the sequence. */
  public A072319() {
    super(4);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
