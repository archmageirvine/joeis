package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000292;

/**
 * A004160 Sum of digits of the n-th tetrahedral number.
 * @author Sean A. Irvine
 */
public class A004160 extends A000292 {

  /** Construct the sequence. */
  public A004160() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}
