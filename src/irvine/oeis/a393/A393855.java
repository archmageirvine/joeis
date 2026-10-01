package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393855 allocated for Marco Rip\u00e0.
 * @author Sean A. Irvine
 */
public class A393855 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(4 * ++mN + 1).multiply(2 * mN * mN + 2 * mN + 1);
  }
}
