package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024389.
 * @author Sean A. Irvine
 */
public class A024389 implements Sequence {

  private final Sequence mB = new A024380();
  private final Sequence mA = new A024378();
  {
    mA.next();
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
