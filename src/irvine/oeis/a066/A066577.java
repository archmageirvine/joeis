package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066577 a(n) = floor(n/(product of nonzero digits of n)).
 * @author Sean A. Irvine
 */
public class A066577 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN / Functions.DIGIT_NZ_PRODUCT.l(10, mN));
  }
}
