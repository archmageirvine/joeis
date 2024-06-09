package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070520.
 * @author Sean A. Irvine
 */
public class A070524 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(++mN, Functions.PHI.z(mN));
  }
}
