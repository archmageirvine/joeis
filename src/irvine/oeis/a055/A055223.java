package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000866;

/**
 * A055223 One-fourth the digital sum of base 5 representations of 2^n.
 * @author Sean A. Irvine
 */
public class A055223 extends A000866 {

  /** Construct the sequence. */
  public A055223() {
    super(2);
  }

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()) / 4);
  }
}
