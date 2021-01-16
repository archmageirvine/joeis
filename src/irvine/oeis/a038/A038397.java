package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A038397 Concatenate first n squares in reverse order.
 * @author Sean A. Irvine
 */
public class A038397 extends A000290 {

  private final StringBuilder mS = new StringBuilder();
  {
    super.next();
  }

  @Override
  public Z next() {
    mS.insert(0, super.next());
    return new Z(mS);
  }
}
