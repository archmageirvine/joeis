package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A079534 a(n) = phi(n) - ceiling( (log 2 / 2) * (n / log n) ).
 * @author Sean A. Irvine
 */
public class A079534 extends Sequence2 {

  private static final CR LOG2_2 = CR.LOG2.divide(CR.TWO);
  private long mN = 1;

  @Override
  public Z next() {
    return Functions.PHI.z(++mN).subtract(LOG2_2.multiply(mN).divide(CR.valueOf(mN).log()).ceil());
  }
}
