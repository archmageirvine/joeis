package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
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
    return Z.valueOf(Jaguar.factor(Z.ONE.shiftLeft(1 << ++mN).add(1)).bigOmega());
  }
}
