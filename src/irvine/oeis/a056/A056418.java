package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002729;

/**
 * A056418 Number of step cyclic shifted sequences using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056418 implements Sequence {

  private final Sequence mA = new A056413();
  private final Sequence mB = new A056412();
  private final Sequence mC = new A056411();
  private final Sequence mD = new A002729();
  {
    mD.next();
  }

  @Override
  public Z next() {
    return mA.next().subtract(mB.next().multiply(5)).add(mC.next().multiply(10)).subtract(mD.next().multiply(10)).add(5);
  }
}
