package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024390.
 * @author Sean A. Irvine
 */
public class A024390 implements Sequence {

  private final Sequence mB = new A024380();
  private final Sequence mA = new A024379();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
