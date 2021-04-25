package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000051;

/**
 * A046799 Number of distinct prime factors of 2^n+1.
 * @author Sean A. Irvine
 */
public class A046799 extends A000051 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).omega());
  }
}

