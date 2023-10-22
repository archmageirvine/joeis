package irvine.oeis.a364;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A022307.
 * @author Sean A. Irvine
 */
public class A364818 extends A000129 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).omega());
  }
}
