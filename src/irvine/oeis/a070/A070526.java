package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070526 Value of n-th cyclotomic polynomial at 2^n.
 * @author Sean A. Irvine
 */
public class A070526 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(++mN, Z.ONE.shiftLeft(mN));
  }
}
