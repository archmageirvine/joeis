package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A047893 Number of decimal digits of Euler (Zig) numbers A000364.
 * @author Sean A. Irvine
 */
public class A047893 extends A000364 {

  /** Construct the sequence. */
  public A047893() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.DIGIT_LENGTH.z(super.next());
  }
}
