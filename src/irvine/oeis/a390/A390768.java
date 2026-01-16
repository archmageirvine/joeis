package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a139.A139391;

/**
 * A083191.
 * @author Sean A. Irvine
 */
public class A390768 extends A139391 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_LENGTH.i(2, super.next()) - Functions.DIGIT_LENGTH.i(2, ++mN));
  }
}
