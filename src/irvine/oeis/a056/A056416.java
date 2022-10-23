package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002729;

/**
 * A056416 Number of step cyclic shifted sequences using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056416 extends Sequence1 {

  private final Sequence mA = new A056411();
  private final Sequence mB = new A002729();
  {
    mB.next();
  }

  @Override
  public Z next() {
    return mA.next().subtract(mB.next().multiply(3)).add(3);
  }
}
