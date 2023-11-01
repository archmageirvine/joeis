package irvine.oeis.a367;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002064;

/**
 * A367007 Number of distinct prime factors of n*2^n + 1.
 * @author Sean A. Irvine
 */
public class A367007 extends A002064 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).omega());
  }
}
