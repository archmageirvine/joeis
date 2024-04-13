package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066578 a(n) = floor(n/(sum of digits of n)).
 * @author Sean A. Irvine
 */
public class A066578 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN / Functions.DIGIT_SUM.l(mN));
  }
}
