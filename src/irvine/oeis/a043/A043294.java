package irvine.oeis.a043;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A043294 Sum of digits of binomial(2n,n).
 * @author Sean A. Irvine
 */
public class A043294 extends A000984 {

  /** Construct the sequence. */
  public A043294() {
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

