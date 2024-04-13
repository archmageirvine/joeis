package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A004085 Sum of digits of Euler totient function of n.
 * @author Sean A. Irvine
 */
public class A004085 extends A000010 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}

