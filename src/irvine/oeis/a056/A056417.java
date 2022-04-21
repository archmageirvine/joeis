package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002729;

/**
 * A056417 Number of step cyclic shifted sequences using exactly four different symbols.
 * @author Sean A. Irvine
 */
public class A056417 implements Sequence {

  private final Sequence mA = new A056412();
  private final Sequence mB = new A056411();
  private final Sequence mC = new A002729();
  {
    mC.next();
  }

  @Override
  public Z next() {
    return mA.next().subtract(mB.next().multiply(4)).add(mC.next().multiply(6)).subtract(4);
  }
}
