package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070691 (Sum of digits of n)^n.
 * @author Georg Fischer
 */
public class A070691 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(Functions.DIGIT_SUM.l((long) mN)).pow(mN);
  }
}
