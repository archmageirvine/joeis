package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000228;
import irvine.oeis.a002.A002216;

/**
 * A005963 Number of restricted hexagonal polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A005963 extends A000228 {

  private final A002216 mA = new A002216();

  {
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
