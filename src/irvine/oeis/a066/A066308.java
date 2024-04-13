package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066308 a(n) = (sum of digits of n) * (product of digits of n).
 * @author Sean A. Irvine
 */
public class A066308 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitProduct(++mN)).multiply(Functions.DIGIT_SUM.l(mN));
  }
}

