package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393378 a(n) = (8*n)! / ((3*n)! * (n!)^5).
 * @author Sean A. Irvine
 */
public class A393378 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(8 * ++mN).divide(Functions.FACTORIAL.z(3 * mN)).divide(Functions.FACTORIAL.z(mN).pow(5));
  }
}
