package irvine.oeis.a043;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000367;

/**
 * A043295 Sum of digits of numerator of Bernoulli number B(2n).
 * @author Sean A. Irvine
 */
public class A043295 extends A000367 {

  /** Construct the sequence. */
  public A043295() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next().abs());
  }
}

