package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002275;

/**
 * A046053 Total number of prime factors of the repunit R(n)=(10^n-1)/9.
 * @author Sean A. Irvine
 */
public class A046053 extends A002275 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
