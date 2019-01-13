package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001384;
import irvine.oeis.a001.A001385;

/**
 * A000342.
 * @author Sean A. Irvine
 */
public class A000342 implements Sequence {

  private final Sequence mA = new A001385();
  private final Sequence mB = new A001384();

  {
    mA.next();
    mB.next();
  }

  @Override
  public Z next() {
    return mA.next().subtract(mB.next());
  }
}
