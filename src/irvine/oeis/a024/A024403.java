package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024403.
 * @author Sean A. Irvine
 */
public class A024403 implements Sequence {

  private final Sequence mB = new A024393();
  private final Sequence mA = new A024392();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
