package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059018 Write 10*n in base 4; a(n) = sum of digits mod 4.
 * @author Sean A. Irvine
 */
public class A059018 extends Sequence0 {

  private long mN = -10;

  @Override
  public Z next() {
    mN += 10;
    return Z.valueOf(Functions.DIGIT_SUM.l(4, mN) & 3);
  }
}
