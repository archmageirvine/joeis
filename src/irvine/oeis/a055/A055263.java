package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055263 a(n) = Sum of digits of (n + a(n-1)).
 * @author Georg Fischer
 */
public class A055263 extends Sequence0 {

  private int mN = -1;
  private Z mA; // previous term

  @Override
  public Z next() {
    ++mN;
    mA = mN == 0 ? Z.ZERO : Z.valueOf(Functions.DIGIT_SUM.l(mA.add(mN)));
    return mA;
  }
}
