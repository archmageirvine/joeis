package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024401.
 * @author Sean A. Irvine
 */
public class A024401 implements Sequence {

  private final Sequence mB = new A024392();
  private final Sequence mA = new A024391();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
