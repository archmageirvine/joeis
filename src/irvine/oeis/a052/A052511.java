package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a006.A006218;

/**
 * A052511 Prime(n) - 1 - A006218(n).
 * @author Sean A. Irvine
 */
public class A052511 extends A000040 {

  private final Sequence mA = new A006218();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).subtract(1);
  }
}

