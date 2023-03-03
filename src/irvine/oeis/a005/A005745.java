package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002623;
import irvine.oeis.a002.A002727;

/**
 * A005745 Number of n-covers of an unlabeled 3-set.
 * @author Sean A. Irvine
 */
public class A005745 extends A002727 {

  private final A002623 mA = new A002623();

  {
    next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
