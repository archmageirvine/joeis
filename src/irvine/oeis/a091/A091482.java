package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A091482 a(n) = (3*n)^n.
 * @author Georg Fischer
 */
public class A091482 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(3L * mN).pow(mN);
  }
}
