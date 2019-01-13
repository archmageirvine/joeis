package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a004.A004042;

/**
 * A087021.
 * @author Sean A. Irvine
 */
public class A087021 extends A004042 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).omega());
  }
}

