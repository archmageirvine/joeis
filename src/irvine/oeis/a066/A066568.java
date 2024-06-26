package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066568 a(n) = n - sum of digits of n.
 * @author Sean A. Irvine
 */
public class A066568 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN - Functions.DIGIT_SUM.l(mN));
  }
}
