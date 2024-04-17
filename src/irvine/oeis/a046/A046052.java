package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046052 Number of prime factors of Fermat number F(n).
 * @author Sean A. Irvine
 */
public class A046052 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(Z.ONE.shiftLeft(1L << ++mN).add(1));
  }
}
