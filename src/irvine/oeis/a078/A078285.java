package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078285 Least nontrivial multiple of the n-th prime beginning with 1.
 * @author Sean A. Irvine
 */
public class A078285 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Z.TEN.pow(Functions.DIGIT_LENGTH.l(p)).add(p).subtract(1).divide(p).multiply(p);
  }
}

