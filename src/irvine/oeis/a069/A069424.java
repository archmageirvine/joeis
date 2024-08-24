package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A069424 extends Sequence1 {

  private final Sequence mA = new A069379();
  private final Sequence mB = new A069404();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next().multiply2());
  }
}
