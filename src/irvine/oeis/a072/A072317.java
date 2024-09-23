package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072317 Smallest Fibonacci number containing exactly n 6's.
 * @author Sean A. Irvine
 */
public class A072317 extends A072304 {

  /** Construct the sequence. */
  public A072317() {
    super(6);
  }

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
