package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A056618 Concatenate factorials.
 * @author Sean A. Irvine
 */
public class A056618 extends A000142 {

  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(super.next());
    return new Z(mS);
  }
}

