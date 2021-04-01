package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046052 Number of prime factors of Fermat number F(n).
 * @author Sean A. Irvine
 */
public class A046052 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(Z.ONE.shiftLeft(1 << ++mN).add(1)).bigOmega());
  }
}
