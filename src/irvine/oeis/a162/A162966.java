package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A162966 Union of 1 and nonsquarefree numbers (A013929).
 * @author Georg Fischer
 */
public class A162966 extends A013929 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next();
  }
}
