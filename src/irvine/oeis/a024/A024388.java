package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024388.
 * @author Sean A. Irvine
 */
public class A024388 implements Sequence {

  private final Sequence mB = new A024379();
  private final Sequence mA = new A024378();
  {
    mA.next();
    mA.next();
    mB.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
