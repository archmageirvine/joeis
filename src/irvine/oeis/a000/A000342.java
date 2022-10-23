package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001384;
import irvine.oeis.a001.A001385;

/**
 * A000342 Number of n-node rooted trees of height 5.
 * @author Sean A. Irvine
 */
public class A000342 extends Sequence1 {

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
