package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070524 Value of n-th cyclotomic polynomial at phi(n).
 * @author Sean A. Irvine
 */
public class A070524 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(++mN, Functions.PHI.z(mN));
  }
}
